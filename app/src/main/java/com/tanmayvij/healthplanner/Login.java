package com.tanmayvij.healthplanner;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.TableArrangement;
import com.google.appinventor.components.runtime.TextBox;
import com.google.appinventor.components.runtime.PasswordTextBox;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.TinyDB;
import android.content.Intent;
public class Login extends Form implements HandlesEventDispatching {
  private HorizontalArrangement HorizontalArrangement1;
  private Label login_heading;
  private TableArrangement login_box;
  private Label uname_label;
  private Label pwd_label;
  private TextBox uname_loginbox;
  private PasswordTextBox pwd_loginbox;
  private Label error;
  private HorizontalArrangement HorizontalArrangement2;
  private Button login;
  private Label instructions;
  private HorizontalArrangement HorizontalArrangement4;
  private Button register;
  private TinyDB login_db;
  protected void $define() {
    this.AppName("HealthPlanner");
    this.BackgroundImage("bg_scr.png");
    this.Scrollable(true);
    this.Title("Login");
    HorizontalArrangement1 = new HorizontalArrangement(this);
    HorizontalArrangement1.AlignHorizontal(3);
    HorizontalArrangement1.Width(LENGTH_FILL_PARENT);
    login_heading = new Label(HorizontalArrangement1);
    login_heading.FontBold(true);
    login_heading.FontSize(25);
    login_heading.Text("Please Log In");
    login_heading.TextColor(0xFFFFFFFF);
    login_box = new TableArrangement(this);
    uname_label = new Label(login_box);
    uname_label.Column(0);
    uname_label.FontSize(20);
    uname_label.Row(0);
    uname_label.Text("Username:");
    uname_label.TextColor(0xFFFFFFFF);
    pwd_label = new Label(login_box);
    pwd_label.Column(0);
    pwd_label.FontSize(20);
    pwd_label.Row(1);
    pwd_label.Text("Password:");
    pwd_label.TextColor(0xFFFFFFFF);
    uname_loginbox = new TextBox(login_box);
    uname_loginbox.Column(1);
    uname_loginbox.FontSize(20);
    uname_loginbox.Row(0);
    pwd_loginbox = new PasswordTextBox(login_box);
    pwd_loginbox.Column(1);
    pwd_loginbox.FontSize(20);
    pwd_loginbox.Row(1);
    error = new Label(this);
    error.FontSize(20);
    error.TextColor(0xFFFFC800);
    HorizontalArrangement2 = new HorizontalArrangement(this);
    HorizontalArrangement2.AlignHorizontal(3);
    HorizontalArrangement2.Width(LENGTH_FILL_PARENT);
    login = new Button(HorizontalArrangement2);
    login.FontSize(20);
    login.Shape(1);
    login.Text("Go!");
    instructions = new Label(this);
    instructions.FontSize(20);
    instructions.Text("* You do not need to be connected to the internet to be able to login. Your details will only be used for personalization. Your account will be deleted once you uninstall the app.");
    instructions.TextColor(0xFFFFFFFF);
    HorizontalArrangement4 = new HorizontalArrangement(this);
    HorizontalArrangement4.AlignHorizontal(3);
    HorizontalArrangement4.Width(LENGTH_FILL_PARENT);
    register = new Button(HorizontalArrangement4);
    register.FontSize(20);
    register.Shape(1);
    register.Text("Create an account");
    login_db = new TinyDB(this);
    EventDispatcher.registerEventForDelegation(this, "ClickEvent", "Click" );
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    if( component.equals(login) && eventName.equals("Click") ){
      loginClick();
      return true;
    }
    if( component.equals(register) && eventName.equals("Click") ){
      registerClick();
      return true;
    }
    return false;
  }
  public void loginClick(){
    if(!(uname_loginbox.Text().isEmpty())){
      if((String.valueOf(uname_loginbox.Text()).compareTo(String.valueOf(login_db.GetValue("username", ""))) == 0)){
        if((String.valueOf(pwd_loginbox.Text()).compareTo(String.valueOf(login_db.GetValue("password", ""))) == 0)){
          login_db.StoreValue("session", true);
          startActivity(new Intent().setClass(this, MainScreen.class));
        }
        else {
          error.Text("Incorrect Password");
        }
      }
      else {
        error.Text("User doesn't exist");
      }
    }
    else {
      error.Text("Please type your username");
    }
  }
  public void registerClick(){
    startActivity(new Intent().setClass(this, Register.class));
  }
}