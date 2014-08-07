
package javaeetutorial.beans;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
@SessionScoped
public class MyLoginBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private String name;
    private String password;

    /**
     * Creates a new instance of MyLoginBean
     */
    public MyLoginBean() {
    }

    public MyLoginBean(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String newValue) {
        password = newValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String newValue) {
        name = newValue;
    }

    public String login() {

        if (getName().equals("javaee")) {
            String msg = "Success.  Your username is " + getName()
                    + ", and your password is " + getPassword();
            FacesMessage facesMsg = new FacesMessage(msg, msg);
            FacesContext.getCurrentInstance().addMessage(null, facesMsg);
            return "success";
        } else {
            String msg = "Failure. Your username is " + getName()
                    + ", and your password is " + getPassword();
            FacesMessage facesMsg =
                    new FacesMessage(FacesMessage.SEVERITY_ERROR, msg, msg);
            FacesContext.getCurrentInstance().addMessage(null, facesMsg);
            return "failure";
        }
    }
}
