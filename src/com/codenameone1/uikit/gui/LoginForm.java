/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/
package com.codenameone1.uikit.gui;
/*
import com.codename1.components.ImageViewer;
import com.codename1.ui.Button;
import com.codename1.ui.Command;
import static com.codename1.ui.Component.LEFT;
import static com.codename1.ui.Component.RIGHT;
import com.codename1.ui.Container;
import com.codename1.ui.Dialog;
import com.codename1.ui.Display;
import com.codename1.ui.FontImage;
import com.codename1.ui.Form;
import com.codename1.ui.Image;
import com.codename1.ui.Label;
import com.codename1.ui.TextField;
import com.codename1.ui.Toolbar;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.layouts.FlowLayout;
import com.codename1.ui.util.Resources;
import com.kingpins.tunisiagottalent.Services.UserServices;
import java.io.IOException;

/**
 *
 * @author Anis
 */
// public class LoginForm extends Form {

  /*  UserServices us;

    public LoginForm(Resources theme) {
        super(new BorderLayout(BorderLayout.CENTER_BEHAVIOR_CENTER_ABSOLUTE));
        this.us = UserServices.getInstance();
        setUIID("loginForm");

        getTitleArea().setUIID("Container");

        Image logo = theme.getImage("logo.png");
        ImageViewer logoViewer = new ImageViewer(logo);
        Container im = FlowLayout.encloseCenter(logoViewer);
        im.getAllStyles().setMarginTop(200);
        TextField login = new TextField("", "Login", 15, TextField.EMAILADDR);
        TextField password = new TextField("", "Password", 15, TextField.PASSWORD);
        login.getAllStyles().setMargin(LEFT, 0);
        password.getAllStyles().setMargin(LEFT, 0);
        Label loginIcon = new Label("", "TextField");
        Label passwordIcon = new Label("", "TextField");
        loginIcon.getAllStyles().setMargin(RIGHT, 0);
        passwordIcon.getAllStyles().setMargin(RIGHT, 0);
        FontImage.setMaterialIcon(loginIcon, FontImage.MATERIAL_PERSON_OUTLINE, 3);
        FontImage.setMaterialIcon(passwordIcon, FontImage.MATERIAL_LOCK_OUTLINE, 3);

        Button loginButton = new Button("LOGIN");
        loginButton.setUIID("LoginButton");
        loginButton.addActionListener(e -> {
            if ((login.getText().length() == 0) || (password.getText().length() == 0)) {
                Dialog.show("Alert", "Please fill all fields", new Command("OK"));
            } else {
                System.out.println(us);
                if (us.loginAction(login.getText(), password.getText())) {
                    try {
                        new HomeForm(theme).show();
                    } catch (IOException ex) {

                    }
                } else {
                    Dialog.show("Alert", "Please Verify all credentials", new Command("OK"));
                }
            }

        });

        Button createNewAccount = new Button("CREATE NEW ACCOUNT");
        createNewAccount.setUIID("CreateNewAccountButton");

        // We remove the extra space for low resolution devices so things fit better
        Label spaceLabel;
        if (!Display.getInstance().isTablet() && Display.getInstance().getDeviceDensity() < Display.DENSITY_VERY_HIGH) {
            spaceLabel = new Label();
        } else {
            spaceLabel = new Label(" ");
        }

        Container by = BoxLayout.encloseY(
                spaceLabel,
                BorderLayout.center(login).
                        add(BorderLayout.WEST, loginIcon),
                BorderLayout.center(password).
                        add(BorderLayout.WEST, passwordIcon),
                loginButton,
                createNewAccount
        );
        add(BorderLayout.NORTH, im);
        add(BorderLayout.CENTER, by);

        // for low res and landscape devices
        by.setScrollableY(false);
        by.setScrollVisible(false);
    }
*/
//}
