package com.example.contactmanager.myViewModel

import androidx.databinding.Bindable
import androidx.databinding.Observable
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.contactmanager.room.User
import com.example.contactmanager.room.UserRepository
import kotlinx.coroutines.launch

class UserViewModel(private val repository: UserRepository):ViewModel(),Observable {
  override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {

  }

  override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {

  }

  val users=repository.users
  private var isUpdateOrDelete=false
    private lateinit var userToUpdateOrDelete:User

    @Bindable
    val inputName=MutableLiveData<String?>()
    @Bindable
    val inputEmail=MutableLiveData<String?>()

  @Bindable
  val saveOrUpdateButtonText=MutableLiveData<String>()

  @Bindable
  val deleteOrDeleteAllBtnText=MutableLiveData<String>()

  init {
      saveOrUpdateButtonText.value="Save"
    deleteOrDeleteAllBtnText.value="Delete"
  }

  fun saveOrUpdate(){
    if(isUpdateOrDelete){
      //Make Update
      userToUpdateOrDelete.name=inputName.value!!
      userToUpdateOrDelete.email=inputEmail.value!!
      update(userToUpdateOrDelete)
    }else{
      //Insert Function
      val name=inputName.value!!
      val email=inputEmail.value!!

      insert(User(0,name,email))

      inputName.value=null
      inputEmail.value=null
    }

  }
  fun clearAllorDelete(){
    if(isUpdateOrDelete){
      delete(userToUpdateOrDelete)
    }else{
    clearAll()
  }}
  fun insert(user: User)=viewModelScope.launch {
    repository.insert(user)
  }

  fun clearAll()=viewModelScope.launch {
    repository.deleteAll()
  }

  fun update(user: User)=viewModelScope.launch {
    repository.update(user)

    //Resetting The Buttons and Fields
    inputName.value=null
    inputEmail.value=null
    isUpdateOrDelete=false
    saveOrUpdateButtonText.value="Save"
    deleteOrDeleteAllBtnText.value="Clear All"
  }
  fun delete(user: User)=viewModelScope.launch {
    repository.delete(user)
    //Resetting The Buttons and Fields
    inputName.value=null
    inputEmail.value=null
    isUpdateOrDelete=false
    saveOrUpdateButtonText.value="Save"
    deleteOrDeleteAllBtnText.value="Clear All"
  }

  fun initupdateAndDelete(selectedItem: User) {

    inputName.value=selectedItem.name
    inputEmail.value=selectedItem.email
    isUpdateOrDelete=true
    userToUpdateOrDelete=selectedItem
    saveOrUpdateButtonText.value="Update"
    deleteOrDeleteAllBtnText.value="Delete"
  }

}