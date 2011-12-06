package controllers;

import play.modules.force.Force;
import play.mvc.Controller;
import play.mvc.With;

import com.force.api.DataApi;


@With(controllers.force.Secure.class)
public class Application extends Controller {

    public static void index() {
    	DataApi api = Force.dataApi(session);
    	System.out.println(api.getIdentity().getFirstName());
        render();
    }

}
