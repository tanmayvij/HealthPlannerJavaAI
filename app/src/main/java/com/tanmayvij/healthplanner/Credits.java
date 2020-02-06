package com.tanmayvij.healthplanner;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Label;
import android.content.Intent;
public class Credits extends Form implements HandlesEventDispatching {
  private HorizontalArrangement HorizontalArrangement1;
  private Button home;
  private Label Label1;
  private Label Label2;
  private Label Label3;
  private Label Label4;
  private Label Label5;
  private Label Label6;
  private Label Label7;
  private Label Label8;
  private Label Label9;
  private Label Label10;
  protected void $define() {
    this.AppName("DietPlannner");
    this.BackgroundImage("bg_scr.png");
    this.Scrollable(true);
    this.Title("Credits");
    HorizontalArrangement1 = new HorizontalArrangement(this);
    HorizontalArrangement1.AlignHorizontal(2);
    HorizontalArrangement1.Width(LENGTH_FILL_PARENT);
    home = new Button(HorizontalArrangement1);
    home.Image("home-7-64.png");
    Label1 = new Label(this);
    Label1.FontSize(30);
    Label1.Text("All rights reserved by:");
    Label1.TextColor(0xFFFFFFFF);
    Label2 = new Label(this);
    Label2.FontSize(20);
    Label2.Text("St. Mark's Sr. Sec. Public School, Meera Bagh, New Delhi-110087");
    Label2.TextColor(0xFFFFFFFF);
    Label3 = new Label(this);
    Label3.FontSize(30);
    Label3.Text("Special thanks to:");
    Label3.TextColor(0xFFFFFFFF);
    Label4 = new Label(this);
    Label4.FontSize(25);
    Label4.Text("* Teachers:");
    Label4.TextColor(0xFFFFFFFF);
    Label5 = new Label(this);
    Label5.FontSize(20);
    Label5.Text("Mr. Naveen Gupta");
    Label5.TextColor(0xFFFFFFFF);
    Label6 = new Label(this);
    Label6.FontSize(20);
    Label6.Text("Mr. Dhruv Gupta");
    Label6.TextColor(0xFFFFFFFF);
    Label7 = new Label(this);
    Label7.FontSize(25);
    Label7.Text("* Platform used:");
    Label7.TextColor(0xFFFFFFFF);
    Label8 = new Label(this);
    Label8.FontSize(20);
    Label8.Text("MIT App Inventor 2");
    Label8.TextColor(0xFFFFFFFF);
    Label9 = new Label(this);
    Label9.FontSize(25);
    Label9.Text("* Information sources:");
    Label9.TextColor(0xFFFFFFFF);
    Label10 = new Label(this);
    Label10.FontSize(20);
    Label10.Text("- Justdial.com");
    Label10.TextColor(0xFFFFFFFF);
    EventDispatcher.registerEventForDelegation(this, "ClickEvent", "Click" );
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    if( component.equals(home) && eventName.equals("Click") ){
      homeClick();
      return true;
    }
    return false;
  }
  public void homeClick(){
    startActivity(new Intent().setClass(this, MainScreen.class));
  }
}