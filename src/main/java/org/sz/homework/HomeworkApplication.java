package org.sz.homework;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.sz.homework.rest.StudentResource;

/**
 * Created By: paullawler
 */
public class HomeworkApplication extends Application<HomeworkConfiguration> {

    public static void main(String[] args) throws Exception {
        new HomeworkApplication().run(args);
    }

    @Override
    public String getName() {
        return "Gah! Homework!";
    }

    @Override
    public void initialize(Bootstrap<HomeworkConfiguration> homeworkConfigurationBootstrap) {

    }

    @Override
    public void run(HomeworkConfiguration homeworkConfiguration, Environment environment) throws Exception {
        environment.jersey().register(new StudentResource());
    }

}
