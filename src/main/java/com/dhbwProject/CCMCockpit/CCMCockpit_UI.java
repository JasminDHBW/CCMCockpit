package com.dhbwProject.CCMCockpit;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of a html page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("CCMCockpit")
public class CCMCockpit_UI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
    	VerticalLayout vl = new VerticalLayout();
    	HorizontalLayout hl = new HorizontalLayout();
    	HorizontalLayout hl1 = new HorizontalLayout();
    	//MySql Buttons
    	Button btnsqlaus = new Button();
    	btnsqlaus.setCaption("MySQL starten");
    	btnsqlaus.addClickListener(e->{
    		//Platz für den Methodenaufruf
    	});
    	Button btnsqlein = new Button();
    	btnsqlein.setCaption("MySQL schließen");
    	btnsqlein.addClickListener(e-> {
    		//Methodenaufruf
    	});
    	
    	
    	//Apache Buttons
    	Button btnapacheein = new Button();
    	btnapacheein.setCaption("Apache starten");
    	btnapacheein.addClickListener(e-> {
    		//Methodenaufruf
    	});
    	Button btnapacheaus = new Button();
    	btnapacheaus.setCaption("Apache schließen");
    	btnapacheaus.addClickListener(e-> {
    		//Methodenaufruf
    	});
    	
    	//Tomcat Buttons
    	Button btntomcatein = new Button();
    	btntomcatein.setCaption("Tomcat starten");
    	btntomcatein.addClickListener(e-> {
    		//Methodenaufruf
    	});
    	Button btntomcataus = new Button();
    	btntomcataus.setCaption("Tomcat schließen");
    	btntomcataus.addClickListener(e-> {
    		//Methodenaufruf
    	});
    	//Beschriftung damit es etwas übersichtlicher aussieht.
    	Label labelSQL = new Label("SQL Server: ");
    	Label labelApache = new Label ("Apache Server: ");
    	Label labelTomcat = new Label ("Tomcat Server: ");
    	vl.setMargin(true);
    	vl.setSpacing(true);
    	
    	vl.addComponent(labelSQL);
    	vl.addComponent(btnsqlein);
    	vl.addComponent(btnsqlaus);
    
    	vl.addComponent(labelApache);
    	vl.addComponent(btnapacheein);
    	vl.addComponent(btnapacheaus);
    	
    	vl.addComponent(labelTomcat);
       	vl.addComponent(btntomcatein);
    	vl.addComponent(btntomcataus);
    	
    	setContent(vl);
    	
    	
    
    }

    @WebServlet(urlPatterns = "/*", name = "CCMCockpit_UIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = CCMCockpit_UI.class, productionMode = false)
    public static class CCMCockpit_UIServlet extends VaadinServlet {
    }
}
