/*
 * Copyright 2015 nikensonmidi.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package KeywordsEvent;

import KeywordsModel.DataManagement;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.MenuModel;

/**
 *
 * @author mayhem
 */
@ManagedBean(name="EV")
@ViewScoped
public class EastViewController extends DataManagement
{
    private MenuModel model;
   
  
    @PostConstruct
    public void init() 
    {
      
        model = new DefaultMenuModel();
        DefaultMenuItem item = new DefaultMenuItem("Profile");
        item.setOnclick("PF('profile').show();");
        item.setIcon("ui-icon-home");
        model.addElement(item);
        /**
         * Inside quizzes there would be a CRUD functionality Along with various
         * challenges functionality The CRUD functionality would be displayed as
         * default The page That is used to create the new quiz would be the
         * CRUD page The challenges would be displayed in tabs: Test, timed Test
         * and Online challenges: Come at me bro, Roundtable ...
         *
         */
        item = new DefaultMenuItem("Quizzes & Challenges");
        item.setOutcome("profile.xhtml");
        item.setIcon("ui-icon-pencil");
        model.addElement(item);
        /**
         * Messages from other users who would invite you into a challenge,
         * (possible calendar to set challenge date). it would be a dialog
         * displaying all widget modal is false
         */
        item = new DefaultMenuItem("Notifications");
        item.setOnclick("PF('notify').show();");
        item.setIcon("ui-icon-mail-closed");
        model.addElement(item);
        /**
         * Video to explain the webApp
         */
        item = new DefaultMenuItem("Help");
        item.setCommand("#{VM.logout()}");
        item.setIcon("ui-icon-help");
        model.addElement(item);

        item = new DefaultMenuItem("Logout");
        item.setCommand("#{VM.logout()}");
        item.setIcon("ui-icon-mail-closed");
        model.addElement(item);

    }//end of init()

    public MenuModel getModel() 
    {
        return model;
    }

    public void setModel(MenuModel model) 
    {
        this.model = model;
    }
   
    
}//end of EastViewController
