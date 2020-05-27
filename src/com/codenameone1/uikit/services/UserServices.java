/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codenameone1.uikit.services;

import com.codename1.io.CharArrayReader;
import com.codename1.io.ConnectionRequest;
import com.codename1.io.JSONParser;
import com.codename1.io.NetworkManager;
import com.codename1.l10n.DateFormat;
import com.codename1.l10n.DateFormatPatterns;
import com.codename1.l10n.ParseException;
import com.codename1.l10n.SimpleDateFormat;

import com.codenameone1.uikit.entities.User;
import com.codenameone1.uikit.utils.Statics;
import com.codenameone1.uikit.utils.UserSession;
import java.io.IOException;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Anis
 */
public class UserServices {

    public static UserServices instance;
    private final ConnectionRequest con;

    public UserServices() {
        con = new ConnectionRequest();
    }

    public static UserServices getInstance() {
        if (instance == null) {
            instance = new UserServices();
        }
        return instance;
    }
    boolean result;

    public boolean loginAction(String username, String password) {

        // création d'une nouvelle demande de connexion
        String url = Statics.BASE_URL + "/tasks/login/" + username + "/" + password;
        con.setUrl(url);// Insertion de l'URL de notre demande de connexion

        con.addResponseListener((e) -> {
            result = con.getResponseCode() == 200;
            if (result) {
                try {
                    parseListUserJson(new String(con.getResponseData()));
                    String str = new String(con.getResponseData());//Récupération de la réponse du serveur
                     System.out.println(str);//Affichage de la réponse serveur sur la console
                } catch (ParseException ex) {

                }
            }
        });
        NetworkManager.getInstance().addToQueueAndWait(con);// Ajout de notre demande de connexion à la file d'attente du NetworkManager
        return result;
    }

    public User parseListUserJson(String json) throws ParseException {

        User u = new User();
        try {
            JSONParser j = new JSONParser();

            Map<String, Object> obj = j.parseJSON(new CharArrayReader(json.toCharArray()));
            u.setId((int) (double) obj.get("id"));
            u.setUsername(obj.get("username").toString());
            u.setEmail(obj.get("email").toString());
            u.setRole(obj.get("roles").toString());
            if (obj.get("birthday") != null) {
                u.setBirthday(new Date((((Double) ((Map<String, Object>) obj.get("birthday")).get("timestamp")).longValue() * 1000)));
            }
            if (obj.get("profilePic") != null) {
                u.setProfilePic(obj.get("profilePic").toString());
            }
            if (obj.get("sexe") != null) {
                u.setGender(obj.get("sexe").toString());
            }
            if (obj.get("telephoneNumber") != null) {
                u.setPhone_number(obj.get("telephoneNumber").toString());
            }
            if (obj.get("adresse") != null) {
                u.setAddress(obj.get("adresse").toString());
            }
            if (obj.get("name") != null) {
                u.setName(obj.get("name").toString());
            }
            if (obj.get("firstName") != null) {
                u.setLastName(obj.get("firstName").toString());
            }
            if (obj.get("bio") != null) {
                u.setBio(obj.get("bio").toString());
            }
            UserSession z = UserSession.getInstance(u);
            System.out.println(UserSession.instance);

        } catch (IOException ex) {
        }

        return u;
    }

}
