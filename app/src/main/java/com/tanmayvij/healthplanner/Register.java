package com.tanmayvij.healthplanner;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.VerticalScrollArrangement;
import com.google.appinventor.components.runtime.TextBox;
import com.google.appinventor.components.runtime.PasswordTextBox;
import com.google.appinventor.components.runtime.TinyDB;
import android.content.Intent;
public class Register extends Form implements HandlesEventDispatching {
  private HorizontalArrangement HorizontalArrangement1;
  private Label Label1;
  private Label confirmation;
  private Button login;
  private VerticalScrollArrangement VerticalScrollArrangement1;
  private Label name_reg_label;
  private TextBox name_regbox;
  private Label uname_reg_label;
  private TextBox uname_regbox;
  private Label pwd_reg_label;
  private PasswordTextBox pwd_regbox;
  private Label mob_self_reg_label;
  private TextBox mob_self_regbox;
  private Label mob_sos_reg_label;
  private TextBox mob_sos_regbox;
  private HorizontalArrangement HorizontalArrangement2;
  private Button register;
  private TinyDB login_db;
  protected void $define() {
    this.AppName("HealthPlanner");
    this.BackgroundImage("bg_scr.png");
    this.Scrollable(true);
    this.Title("Register");
    HorizontalArrangement1 = new HorizontalArrangement(this);
    HorizontalArrangement1.AlignHorizontal(3);
    HorizontalArrangement1.Width(LENGTH_FILL_PARENT);
    Label1 = new Label(HorizontalArrangement1);
    Label1.FontSize(18);
    Label1.Text("New User? Create an Account");
    Label1.TextColor(0xFFFFFFFF);
    confirmation = new Label(this);
    confirmation.FontSize(20);
    confirmation.TextColor(0xFF00FF00);
    login = new Button(this);
    login.FontSize(20);
    login.Shape(1);
    login.Text("Login");
    VerticalScrollArrangement1 = new VerticalScrollArrangement(this);
    VerticalScrollArrangement1.Height(LENGTH_FILL_PARENT);
    VerticalScrollArrangement1.Width(LENGTH_FILL_PARENT);
    name_reg_label = new Label(VerticalScrollArrangement1);
    name_reg_label.FontSize(20);
    name_reg_label.Text("Your Name:");
    name_reg_label.TextColor(0xFFFFFFFF);
    name_regbox = new TextBox(VerticalScrollArrangement1);
    name_regbox.FontSize(20);
    name_regbox.Width(LENGTH_FILL_PARENT);
    uname_reg_label = new Label(VerticalScrollArrangement1);
    uname_reg_label.FontSize(20);
    uname_reg_label.Text("Choose a username:");
    uname_reg_label.TextColor(0xFFFFFFFF);
    uname_regbox = new TextBox(VerticalScrollArrangement1);
    uname_regbox.FontSize(20);
    uname_regbox.Width(LENGTH_FILL_PARENT);
    pwd_reg_label = new Label(VerticalScrollArrangement1);
    pwd_reg_label.FontSize(20);
    pwd_reg_label.Text("Choose a password:");
    pwd_reg_label.TextColor(0xFFFFFFFF);
    pwd_regbox = new PasswordTextBox(VerticalScrollArrangement1);
    pwd_regbox.FontSize(20);
    pwd_regbox.Width(LENGTH_FILL_PARENT);
    mob_self_reg_label = new Label(VerticalScrollArrangement1);
    mob_self_reg_label.FontSize(20);
    mob_self_reg_label.Text("Your Mobile:");
    mob_self_reg_label.TextColor(0xFFFFFFFF);
    mob_self_regbox = new TextBox(VerticalScrollArrangement1);
    mob_self_regbox.FontSize(20);
    mob_self_regbox.Width(LENGTH_FILL_PARENT);
    mob_self_regbox.NumbersOnly(true);
    mob_sos_reg_label = new Label(VerticalScrollArrangement1);
    mob_sos_reg_label.FontSize(20);
    mob_sos_reg_label.Text("Please provide an emergency contact's mobile number:");
    mob_sos_reg_label.TextColor(0xFFFFFFFF);
    mob_sos_regbox = new TextBox(VerticalScrollArrangement1);
    mob_sos_regbox.FontSize(20);
    mob_sos_regbox.Width(LENGTH_FILL_PARENT);
    mob_sos_regbox.NumbersOnly(true);
    HorizontalArrangement2 = new HorizontalArrangement(this);
    HorizontalArrangement2.AlignHorizontal(3);
    HorizontalArrangement2.Width(LENGTH_FILL_PARENT);
    register = new Button(HorizontalArrangement2);
    register.FontSize(20);
    register.Shape(1);
    register.Text("Register");
    login_db = new TinyDB(this);
    EventDispatcher.registerEventForDelegation(this, "ClickEvent", "Click" );
    EventDispatcher.registerEventForDelegation(this, "InitializeEvent", "Initialize" );
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    if( component.equals(login) && eventName.equals("Click") ){
      loginClick();
      return true;
    }
    if( component.equals(this) && eventName.equals("Initialize") ){
      thisInitialize();
      return true;
    }
    if( component.equals(register) && eventName.equals("Click") ){
      registerClick();
      return true;
    }
    return false;
  }
  public void loginClick(){
    startActivity(new Intent().setClass(this, Login.class));
  }
  public void thisInitialize(){
    login.Visible(false);
  }
  public void registerClick(){
    login_db.StoreValue("name", name_regbox.Text());
    login_db.StoreValue("username", uname_regbox.Text());
    login_db.StoreValue("password", pwd_regbox.Text());
    login_db.StoreValue("mob_self", mob_self_regbox.Text());
    login_db.StoreValue("mob_sos", mob_sos_regbox.Text());
  }
}