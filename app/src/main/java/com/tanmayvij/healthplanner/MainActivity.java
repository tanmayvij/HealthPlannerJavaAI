package com.tanmayvij.healthplanner;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Canvas;
import com.google.appinventor.components.runtime.ImageSprite;
import com.google.appinventor.components.runtime.VerticalArrangement;
import com.google.appinventor.components.runtime.CheckBox;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.TinyDB;
import android.content.Intent;
public class MainActivity extends Form implements HandlesEventDispatching {
    private Label heading;
    private HorizontalArrangement HorizontalArrangement1;
    private Canvas Canvas1;
    private ImageSprite ImageSprite1;
    private VerticalArrangement VerticalArrangement1;
    private Label para1;
    private Label para2;
    private Label para3;
    private Label para4;
    private Label para5;
    private Label para7;
    private VerticalArrangement VerticalArrangement2;
    private CheckBox CheckBox1;
    private Button Button1;
    private TinyDB TinyDB1;
    protected void $define() {
        this.AlignHorizontal(3);
        this.AppName("Health Planner");
        this.BackgroundImage("bg_scr.png");
        this.Icon("final_icon.png");
        this.Scrollable(true);
        this.Title("Welcome");
        heading = new Label(this);
        heading.FontBold(true);
        heading.FontSize(25);
        heading.FontTypeface(2);
        heading.Width(LENGTH_FILL_PARENT);
        heading.Text("Welcome to Health Planner 1.0!");
        HorizontalArrangement1 = new HorizontalArrangement(this);
        Canvas1 = new Canvas(HorizontalArrangement1);
        Canvas1.BackgroundColor(0x00FFFFFF);
        Canvas1.Height(96);
        Canvas1.Width(96);
        Canvas1.LineWidth(0);
        Canvas1.PaintColor(0x00FFFFFF);
        ImageSprite1 = new ImageSprite(Canvas1);
        ImageSprite1.Initialize();
        ImageSprite1.Height(96);
        ImageSprite1.Width(96);
        ImageSprite1.Picture("final_icon.png");
        ImageSprite1.X(0);
        ImageSprite1.Y(0);
        ImageSprite1.Z(0);
        VerticalArrangement1 = new VerticalArrangement(this);
        para1 = new Label(VerticalArrangement1);
        para1.FontSize(20);
        para1.Text("Suffering from a disease and can't eat your regular diet? No time to go to the doctor? Confused what to eat and what to avoid?");
        para1.TextColor(0xFFFFFFFF);
        para2 = new Label(VerticalArrangement1);
        para2.FontSize(20);
        para2.Text("Not anymore! We'll help you figure out what's the best diet to keep you fit.");
        para2.TextColor(0xFFFFFFFF);
        para3 = new Label(VerticalArrangement1);
        para3.FontSize(20);
        para3.Text("Just select your problem from the list and get a complete guide on what you should eat and what needs to be avoided! The app works offline, so you don't have to care about internet connectivity.");
        para3.TextColor(0xFFFFFFFF);
        para4 = new Label(VerticalArrangement1);
        para4.FontSize(20);
        para4.Text("The app also features an SOS button, which lets you choose your area pin code to determine your area and get a list of nearby doctors and hospitals along with contact details.");
        para4.TextColor(0xFFFFFFFF);
        para5 = new Label(VerticalArrangement1);
        para5.FontSize(20);
        para5.Text("* Please note that the SOS feature is currently available only in select areas of New Delhi.");
        para5.TextColor(0xFFFFFFFF);
        para7 = new Label(VerticalArrangement1);
        para7.FontSize(20);
        para7.Text("On registering, you'll be asked to provide an emergency contact's mobile number. This number can be dialed by using the S.O.S Call button.");
        para7.TextColor(0xFFFFFFFF);
        VerticalArrangement2 = new VerticalArrangement(this);
        VerticalArrangement2.AlignHorizontal(3);
        VerticalArrangement2.Width(LENGTH_FILL_PARENT);
        CheckBox1 = new CheckBox(VerticalArrangement2);
        CheckBox1.FontSize(20);
        CheckBox1.Text("Don't show this page again");
        Button1 = new Button(VerticalArrangement2);
        Button1.FontSize(25);
        Button1.Text("Start Now!");
        TinyDB1 = new TinyDB(this);
        EventDispatcher.registerEventForDelegation(this, "InitializeEvent", "Initialize" );
        EventDispatcher.registerEventForDelegation(this, "ClickEvent", "Click" );
    }
    public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
        if( component.equals(this) && eventName.equals("Initialize") ){
            thisInitialize();
            return true;
        }
        if( component.equals(Button1) && eventName.equals("Click") ){
            Button1Click();
            return true;
        }
        return false;
    }
    public void thisInitialize(){
        if((String.valueOf(TinyDB1.GetValue("ShowWelcomePage", "")).compareTo(String.valueOf(false)) == 0)){
            startActivity(new Intent().setClass(this, MainScreen.class));
        }
    }
    public void Button1Click(){
        if(CheckBox1.Checked()){
            TinyDB1.StoreValue("ShowWelcomePage", false);
        }
        startActivity(new Intent().setClass(this, MainScreen.class));
    }
}