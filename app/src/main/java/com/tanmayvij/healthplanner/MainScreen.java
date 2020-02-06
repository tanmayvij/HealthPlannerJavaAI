package com.tanmayvij.healthplanner;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.TableArrangement;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Image;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.VerticalArrangement;
import com.google.appinventor.components.runtime.ListPicker;
import com.google.appinventor.components.runtime.LocationSensor;
import com.google.appinventor.components.runtime.TinyDB;
import com.google.appinventor.components.runtime.PhoneCall;
import android.content.Intent;
public class MainScreen extends Form implements HandlesEventDispatching {
  private TableArrangement TableArrangement1;
  private HorizontalArrangement HorizontalArrangement1;
  private Image logo;
  private HorizontalArrangement HorizontalArrangement2;
  private Button menu;
  private HorizontalArrangement HorizontalArrangement3;
  private HorizontalArrangement HorizontalArrangement4;
  private Label greeting;
  private VerticalArrangement VerticalArrangement2;
  private Button AboutApp;
  private Button AboutDev;
  private Button Credits;
  private Button Logout;
  private VerticalArrangement VerticalArrangement3;
  private HorizontalArrangement HorizontalArrangement5;
  private Button sos_call;
  private ListPicker sos;
  private ListPicker diseasepicker;
  private LocationSensor LocationSensor1;
  private TinyDB login_db;
  private PhoneCall PhoneCall1;
  protected void $define() {
    this.AppName("DietPlannner");
    this.Title("MainScreen");
    TableArrangement1 = new TableArrangement(this);
    TableArrangement1.Width(LENGTH_FILL_PARENT);
    TableArrangement1.Rows(1);
    HorizontalArrangement1 = new HorizontalArrangement(TableArrangement1);
    HorizontalArrangement1.BackgroundColor(0xFFFFC800);
    HorizontalArrangement1.Column(0);
    HorizontalArrangement1.Height(LENGTH_FILL_PARENT);
    HorizontalArrangement1.Width(-1050);
    HorizontalArrangement1.Row(0);
    logo = new Image(HorizontalArrangement1);
    logo.Height(96);
    logo.Width(96);
    logo.Picture("final_icon.png");
    HorizontalArrangement2 = new HorizontalArrangement(TableArrangement1);
    HorizontalArrangement2.AlignHorizontal(2);
    HorizontalArrangement2.BackgroundColor(0xFFFFC800);
    HorizontalArrangement2.Column(1);
    HorizontalArrangement2.Height(LENGTH_FILL_PARENT);
    HorizontalArrangement2.Width(-1050);
    HorizontalArrangement2.Row(0);
    menu = new Button(HorizontalArrangement2);
    menu.Height(64);
    menu.Width(64);
    menu.Image("arrow-206-128.png");
    HorizontalArrangement3 = new HorizontalArrangement(this);
    HorizontalArrangement3.AlignHorizontal(2);
    HorizontalArrangement3.Height(-1035);
    HorizontalArrangement3.Width(LENGTH_FILL_PARENT);
    HorizontalArrangement3.Image("download.jpg");
    HorizontalArrangement4 = new HorizontalArrangement(HorizontalArrangement3);
    HorizontalArrangement4.Width(LENGTH_FILL_PARENT);
    greeting = new Label(HorizontalArrangement4);
    greeting.FontSize(20);
    VerticalArrangement2 = new VerticalArrangement(HorizontalArrangement3);
    AboutApp = new Button(VerticalArrangement2);
    AboutApp.Width(LENGTH_FILL_PARENT);
    AboutApp.Text("About App");
    AboutDev = new Button(VerticalArrangement2);
    AboutDev.Text("About the Developer");
    Credits = new Button(VerticalArrangement2);
    Credits.Width(LENGTH_FILL_PARENT);
    Credits.Text("Credits");
    Logout = new Button(VerticalArrangement2);
    Logout.FontSize(14);
    Logout.Width(LENGTH_FILL_PARENT);
    Logout.Text("Logout");
    VerticalArrangement3 = new VerticalArrangement(this);
    VerticalArrangement3.Height(LENGTH_FILL_PARENT);
    VerticalArrangement3.Width(LENGTH_FILL_PARENT);
    HorizontalArrangement5 = new HorizontalArrangement(VerticalArrangement3);
    HorizontalArrangement5.Height(LENGTH_FILL_PARENT);
    HorizontalArrangement5.Width(LENGTH_FILL_PARENT);
    sos_call = new Button(HorizontalArrangement5);
    sos_call.BackgroundColor(0xFFFF0000);
    sos_call.FontSize(20);
    sos_call.Height(LENGTH_FILL_PARENT);
    sos_call.Width(-1050);
    sos_call.Text("S.O.S Call");
    sos_call.TextColor(0xFFFFFFFF);
    sos = new ListPicker(HorizontalArrangement5);
    sos.ElementsFromString("110001, 110005, 110015, 110016, 110017, 110018, 110027, 110034, 110058, 110063, 110085, 110087");
    sos.Height(LENGTH_FILL_PARENT);
    sos.Width(LENGTH_FILL_PARENT);
    sos.Image("bg_sos.png");
    sos.ItemBackgroundColor(0xFFFFFFFF);
    sos.ItemTextColor(0xFF000000);
    diseasepicker = new ListPicker(VerticalArrangement3);
    diseasepicker.ElementsFromString("Cold, Fever, Influenza, Typhoid, Jaundice, Diarrhoea, Cholera, Acidity, Cardiac, Dengue, Malaria, Diabetes, Hypertension, Arthritis, Tuberculosis, Cataract, Anemia");
    diseasepicker.Height(LENGTH_FILL_PARENT);
    diseasepicker.Width(LENGTH_FILL_PARENT);
    diseasepicker.Image("bg_disease.png");
    LocationSensor1 = new LocationSensor(this);
    LocationSensor1.DistanceInterval(1);
    LocationSensor1.TimeInterval(1000);
    login_db = new TinyDB(this);
    PhoneCall1 = new PhoneCall(this);
    EventDispatcher.registerEventForDelegation(this, "InitializeEvent", "Initialize" );
    EventDispatcher.registerEventForDelegation(this, "AfterPickingEvent", "AfterPicking" );
    EventDispatcher.registerEventForDelegation(this, "ClickEvent", "Click" );
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    if( component.equals(this) && eventName.equals("Initialize") ){
      thisInitialize();
      return true;
    }
    if( component.equals(diseasepicker) && eventName.equals("AfterPicking") ){
      diseasepickerAfterPicking();
      return true;
    }
    if( component.equals(sos) && eventName.equals("AfterPicking") ){
      sosAfterPicking();
      return true;
    }
    if( component.equals(sos_call) && eventName.equals("Click") ){
      sos_callClick();
      return true;
    }
    if( component.equals(AboutApp) && eventName.equals("Click") ){
      AboutAppClick();
      return true;
    }
    if( component.equals(AboutDev) && eventName.equals("Click") ){
      AboutDevClick();
      return true;
    }
    if( component.equals(Credits) && eventName.equals("Click") ){
      CreditsClick();
      return true;
    }
    if( component.equals(menu) && eventName.equals("Click") ){
      menuClick();
      return true;
    }
    if( component.equals(Logout) && eventName.equals("Click") ){
      LogoutClick();
      return true;
    }
    return false;
  }
  public void thisInitialize(){
    if(!((String.valueOf(login_db.GetValue("session", "")).compareTo(String.valueOf(true)) == 0))){
      startActivity(new Intent().setClass(this, Login.class));
    }
    VerticalArrangement2.Visible(false);
    greeting.Text("Welcome, " + login_db.GetValue("name", "") + "!");
  }
  public void diseasepickerAfterPicking(){
    switch(diseasepicker.Selection()) {
      case "Acidity":
        startActivity(new Intent().setClass(this, Acidity.class));
        break;
      case "Anemia":
        startActivity(new Intent().setClass(this, Anemia.class));
        break;
      case "Arthritis":
        startActivity(new Intent().setClass(this, Arthritis.class));
        break;
      case "Cardiac":
        startActivity(new Intent().setClass(this, Cardiac.class));
        break;
      case "Cataract":
        startActivity(new Intent().setClass(this, Cataract.class));
        break;
      case "Cholera":
        startActivity(new Intent().setClass(this, Cholera.class));
        break;
      case "Cold":
        startActivity(new Intent().setClass(this, Cold.class));
        break;
      case "Dengue":
        startActivity(new Intent().setClass(this, Dengue.class));
        break;
      case "Diabetes":
        startActivity(new Intent().setClass(this, Diabetes.class));
        break;
      case "Diarrhoea":
        startActivity(new Intent().setClass(this, Diarrhoea.class));
        break;
      case "Fever":
        startActivity(new Intent().setClass(this, Fever.class));
        break;
      case "Hypertension":
        startActivity(new Intent().setClass(this, Hypertension.class));
        break;
      case "Influenza":
        startActivity(new Intent().setClass(this, Influenza.class));
        break;
      case "Jaundice":
        startActivity(new Intent().setClass(this, Jaundice.class));
        break;
      case "Malaria":
        startActivity(new Intent().setClass(this, Malaria.class));
        break;
      case "Tuberculosis":
        startActivity(new Intent().setClass(this, Tuberculosis.class));
        break;
      case "Typhoid":
        startActivity(new Intent().setClass(this, Typhoid.class));
        break;
    }
  }
  public void sosAfterPicking(){
    switch(sos.Selection()) {
      case "110001":
        startActivity(new Intent().setClass(this, z110001.class));
        break;

      case "110005":
        startActivity(new Intent().setClass(this, z110005.class));
        break;

      case "110015":
        startActivity(new Intent().setClass(this, z110015.class));
        break;

      case "110016":
        startActivity(new Intent().setClass(this, z110016.class));
        break;

      case "110017":
        startActivity(new Intent().setClass(this, z110017.class));
        break;

      case "110018":
        startActivity(new Intent().setClass(this, z110018.class));
        break;

      case "110027":
        startActivity(new Intent().setClass(this, z110027.class));
        break;

      case "110034":
        startActivity(new Intent().setClass(this, z110034.class));
        break;

      case "110058":
        startActivity(new Intent().setClass(this, z110058.class));
        break;

      case "110063":
        startActivity(new Intent().setClass(this, z110063.class));
        break;

      case "110085":
        startActivity(new Intent().setClass(this, z110085.class));
        break;

      case "110087":
        startActivity(new Intent().setClass(this, z110087.class));
        break;
    }
  }
  public void sos_callClick(){
    PhoneCall1.PhoneNumber(String.valueOf(login_db.GetValue("mob_sos", "")));
  }
  public void AboutAppClick(){
    startActivity(new Intent().setClass(this, AboutApp.class));
  }
  public void AboutDevClick(){
    startActivity(new Intent().setClass(this, AboutDev.class));
  }
  public void CreditsClick(){
    startActivity(new Intent().setClass(this, Credits.class));
  }
  public void menuClick(){
    if((String.valueOf(VerticalArrangement2.Visible()).compareTo(String.valueOf(true)) == 0)){
      VerticalArrangement2.Visible(false);
    }
    else {
      VerticalArrangement2.Visible(true);
    }
  }
  public void LogoutClick(){
    login_db.ClearTag("session");
    startActivity(new Intent().setClass(this, Login.class));
  }
}