package controllers;

import com.sun.org.apache.xerces.internal.util.URI;
import models.RegFormData;
import services.RegFormService;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.List;


@Path("/form")
public class RegFormController {

    @Inject
    private RegFormService regFormService;

    @Path("/")
    @GET
    @Produces("text/HTML")
    public void getAll(@Context HttpServletRequest request,
                       @Context HttpServletResponse response) throws ServletException,
            IOException {

        request.getRequestDispatcher("/Main.jsp").forward(request, response);
    }

    @Path("/")
    @POST
    @Produces(MediaType.TEXT_HTML)
    public void submitForm(@Context HttpServletRequest request,
                           @Context HttpServletResponse response,
                           @FormParam("article") String article,
                           @FormParam("radios1") String participation,
                           @FormParam("lastName") String lastName,
                           @FormParam("firstName") String firstName,
                           @FormParam("middleName") String middleName,
                           @FormParam("radios2") String academicDegree,
                           @FormParam("radios3") String academicTitle,
                           @FormParam("placeOfWork") String placeOfWork,
                           @FormParam("position") String position,
                           @FormParam("country") String country,
                           @FormParam("city") String city,
                           @FormParam("email") String email,
                           @FormParam("contactPhone") String contactNumber,
                           @FormParam("radios4") String certificate,
                           @FormParam("radios5") String invite
    ) {
        regFormService.submitForm(new RegFormData(article, participation, lastName, firstName, middleName,
                academicDegree, academicTitle, placeOfWork, position, country, city, email, contactNumber,
                certificate, invite));
    }


}