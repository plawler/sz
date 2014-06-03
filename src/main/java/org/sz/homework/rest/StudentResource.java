package org.sz.homework.rest;

import com.google.common.collect.Maps;
import org.sz.homework.core.Student;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.Map;

/**
 * Created By: paullawler
 */
@Path("/students")
@Produces("application/json")
@Consumes("application/json")
public class StudentResource {

    private final Map<Long, Student> students;

    public StudentResource() {
        Student s1 = new Student(1597530L, "Walter", "White");
        Student s2 = new Student(2468975L, "Jesse", "Pinkman");
        students = Maps.newHashMap();
        students.put(s1.getId(), s1);
        students.put(s2.getId(), s2);
    }

    @GET
    @Path("/{id}")
    public Response getStudent(@PathParam("id") Long id) {
        try {
            Student student = students.get(id);
            return Response.ok(student).build();
        } catch (Exception e) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

}
