package anttask;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.Task;

public class HelloTask extends Task {
	String message;

	public void execute() throws BuildException {
		log("Messagge: " + message, Project.MSG_INFO);
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
