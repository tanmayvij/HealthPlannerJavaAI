package com.tanmayvij.healthplanner;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Label;
import android.content.Intent;
public class z110016 extends Form implements HandlesEventDispatching {
  private HorizontalArrangement HorizontalArrangement1;
  private Button home;
  private Label Label1;
  private Label Label2;
  private Label Label3;
  private Label Label4;
  private Label Label5;
  protected void $define() {
    this.AppName("HealthPlanner");
    this.BackgroundImage("bg_scr.png");
    this.Scrollable(true);
    this.Title("110016");
    HorizontalArrangement1 = new HorizontalArrangement(this);
    HorizontalArrangement1.AlignHorizontal(2);
    HorizontalArrangement1.Width(LENGTH_FILL_PARENT);
    home = new Button(HorizontalArrangement1);
    home.Image("home-7-64.png");
    Label1 = new Label(this);
    Label1.FontSize(25);
    Label1.Text("Areas Covered:");
    Label1.TextColor(0xFFFFFFFF);
    Label2 = new Label(this);
    Label2.FontSize(20);
    Label2.Text("IIT, Hauz Khas, Ashram, Green Park");
    Label2.TextColor(0xFFFFFFFF);
    Label3 = new Label(this);
    Label3.FontSize(25);
    Label3.Text("Hospitals:");
    Label3.TextColor(0xFFFFFFFF);
    Label4 = new Label(this);
    Label4.FontSize(20);
    Label4.Text("Adiva IVF And Birthing Centre +91-11-46672700, +91-8588835000");
    Label4.TextColor(0xFFFFFFFF);
    Label5 = new Label(this);
    Label5.FontSize(20);
    Label5.Text("Mohinder Hospital +91-11-33063242");
    Label5.TextColor(0xFFFFFFFF);
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