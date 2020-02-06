package com.tanmayvij.healthplanner;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Label;
import android.content.Intent;
public class z110018 extends Form implements HandlesEventDispatching {
  private HorizontalArrangement HorizontalArrangement1;
  private Button home;
  private Label Label1;
  private Label Label2;
  private Label Label3;
  private Label Label4;
  private Label Label5;
  private Label Label6;
  private Label Label7;
  protected void $define() {
    this.AppName("HealthPlanner");
    this.BackgroundImage("bg_scr.png");
    this.Scrollable(true);
    this.Title("110018");
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
    Label2.Text("Vikas Puri, Tilak Nagar, Vishnu Garden, Ashok Nagar, Chand Nagar, Fateh Nagar, Khyala, Mahavir Nagar, Major Bhupinder Singh Nagar");
    Label2.TextColor(0xFFFFFFFF);
    Label3 = new Label(this);
    Label3.FontSize(25);
    Label3.Text("Hospitals:");
    Label3.TextColor(0xFFFFFFFF);
    Label4 = new Label(this);
    Label4.FontSize(20);
    Label4.Text("Aastha Hospital and IVF Centre +91-11-3308597");
    Label4.TextColor(0xFFFFFFFF);
    Label5 = new Label(this);
    Label5.FontSize(20);
    Label5.Text("Shishu Sadan Hospital +91-11-25994783, +91-8459497052");
    Label5.TextColor(0xFFFFFFFF);
    Label6 = new Label(this);
    Label6.FontSize(20);
    Label6.Text("Sharma Hospital +91-11-28541558, +91-9811383949");
    Label6.TextColor(0xFFFFFFFF);
    Label7 = new Label(this);
    Label7.FontSize(20);
    Label7.Text("UK Nursing Home and X-Ray Clinic +91-11-25508998");
    Label7.TextColor(0xFFFFFFFF);
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