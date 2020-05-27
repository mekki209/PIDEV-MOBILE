/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codenameone1.uikit.gui;

import com.codename1.ui.Button;
import com.codename1.ui.Label;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.uikit.cleanmodern.BaseForm;


/**
 *
 * @author mondh
 */
public class HomeForm extends BaseForm {
    BaseForm current;
    public HomeForm() {
        current=this;
        setTitle("Home");
        setLayout(BoxLayout.y());
        
        add(new Label("Choose an option"));
        Button btnAddParticipant = new Button("Add Participant");
        Button btnListParticipant = new Button("List Participant");
        
       // btnAddParticipant.addActionListener(e-> new AddParticipantForm(res).show());
      //  btnListParticipant.addActionListener(e-> new ListParticipantForm(current).show());
        addAll(btnAddParticipant,btnListParticipant);
        
        
    }
    
}
