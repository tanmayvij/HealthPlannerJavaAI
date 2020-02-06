package com.tanmayvij.healthplanner;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Label;
import android.content.Intent;
public class AboutApp extends Form implements HandlesEventDispatching {
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
  protected void $define() {
    this.AppName("HealthPlanner");
    this.BackgroundImage("bg_scr.png");
    this.Scrollable(true);
    this.Title("About the App");
    HorizontalArrangement1 = new HorizontalArrangement(this);
    HorizontalArrangement1.AlignHorizontal(2);
    HorizontalArrangement1.Width(LENGTH_FILL_PARENT);
    home = new Button(HorizontalArrangement1);
    home.Image("home-7-64.png");
    Label1 = new Label(this);
    Label1.FontSize(20);
    Label1.Text("HealthPlanner 1.0 is an android app developed using MIT App Inventor v2.");
    Label1.TextColor(0xFFFFFFFF);
    Label2 = new Label(this);
    Label2.FontBold(true);
    Label2.FontSize(20);
    Label2.Text("The app consists of 2 main features:");
    Label2.TextColor(0xFFFFFFFF);
    Label3 = new Label(this);
    Label3.FontBold(true);
    Label3.FontSize(20);
    Label3.Text("- A Disease Encyclopedia:");
    Label3.TextColor(0xFFFFFFFF);
    Label4 = new Label(this);
    Label4.FontSize(20);
    Label4.Text("Choose any one disease from the list and get complete information on it, including the causes, cures, as well as diet recommendations.");
    Label4.TextColor(0xFFFFFFFF);
    Label5 = new Label(this);
    Label5.FontBold(true);
    Label5.FontSize(20);
    Label5.Text("- An S.O.S feature:");
    Label5.TextColor(0xFFFFFFFF);
    Label6 = new Label(this);
    Label6.FontSize(20);
    Label6.Text("This feature lets you choose your area pin code to determine your location and find you all nearest hospitals and clinics with contact details.");
    Label6.TextColor(0xFFFFFFFF);
    Label7 = new Label(this);
    Label7.FontSize(20);
    Label7.Text("Also, when you use the S.O.S call feature, the emergency contact you provided while registering will be called automatically.");
    Label7.TextColor(0xFFFFFFFF);
    Label8 = new Label(this);
    Label8.FontSize(20);
    Label8.Text("The app has a simple to use and highly responsive UI, so you needn't be a tech savvy in order to be able to use it.");
    Label8.TextColor(0xFFFFFFFF);
    Label9 = new Label(this);
    Label9.FontSize(20);
    Label9.Text("What's unique about the app is that all the data regarding the diseases is available offline. Once the app is installed, you don't require an internet connection to be able to access the data.");
    Label9.TextColor(0xFFFFFFFF);
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