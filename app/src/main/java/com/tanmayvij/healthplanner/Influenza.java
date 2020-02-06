package com.tanmayvij.healthplanner;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Label;
import android.content.Intent;
public class Influenza extends Form implements HandlesEventDispatching {
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
  private Label Label11;
  private Label Label12;
  protected void $define() {
    this.AppName("HealthPlanner");
    this.BackgroundImage("bg_scr.png");
    this.Scrollable(true);
    this.Title("Influenza");
    HorizontalArrangement1 = new HorizontalArrangement(this);
    HorizontalArrangement1.AlignHorizontal(2);
    HorizontalArrangement1.Width(LENGTH_FILL_PARENT);
    home = new Button(HorizontalArrangement1);
    home.Image("home-7-64.png");
    Label1 = new Label(this);
    Label1.FontBold(true);
    Label1.FontSize(25);
    Label1.Text("Cause:");
    Label1.TextColor(0xFFFFFFFF);
    Label2 = new Label(this);
    Label2.FontSize(20);
    Label2.Text("Influenza virus");
    Label2.TextColor(0xFFFFFFFF);
    Label3 = new Label(this);
    Label3.FontBold(true);
    Label3.FontSize(25);
    Label3.Text("What to eat:");
    Label3.TextColor(0xFFFFFFFF);
    Label4 = new Label(this);
    Label4.FontSize(20);
    Label4.Text("* Vegetable Juice");
    Label4.TextColor(0xFFFFFFFF);
    Label5 = new Label(this);
    Label5.FontSize(20);
    Label5.Text("* Ginger");
    Label5.TextColor(0xFFFFFFFF);
    Label6 = new Label(this);
    Label6.FontSize(20);
    Label6.Text("* Garlic");
    Label6.TextColor(0xFFFFFFFF);
    Label7 = new Label(this);
    Label7.FontSize(20);
    Label7.Text("* Hot Tea");
    Label7.TextColor(0xFFFFFFFF);
    Label8 = new Label(this);
    Label8.FontSize(20);
    Label8.Text("* Bananas");
    Label8.TextColor(0xFFFFFFFF);
    Label9 = new Label(this);
    Label9.FontBold(true);
    Label9.FontSize(25);
    Label9.Text("What to avoid:");
    Label9.TextColor(0xFFFFFFFF);
    Label10 = new Label(this);
    Label10.FontSize(20);
    Label10.Text("* Sugary Foods");
    Label10.TextColor(0xFFFFFFFF);
    Label11 = new Label(this);
    Label11.FontSize(20);
    Label11.Text("* Milk");
    Label11.TextColor(0xFFFFFFFF);
    Label12 = new Label(this);
    Label12.FontSize(20);
    Label12.Text("* Meat");
    Label12.TextColor(0xFFFFFFFF);
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