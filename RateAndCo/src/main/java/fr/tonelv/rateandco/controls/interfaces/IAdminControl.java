package fr.tonelv.rateandco.controls.interfaces;

import fr.tonelv.rateandco.models.Course;
import fr.tonelv.rateandco.models.Session;
import fr.tonelv.rateandco.models.Student;
import fr.tonelv.rateandco.models.Trainer;

public interface IAdminControl {

	public Session CreateSession();

	public Session UpdateSession();

	public Boolean DeleteSession();

	public Student CreateStudent();

	public Student UpdateStudent();

	public Trainer CreateTrainer();

	public Trainer UpdateTrainer();

	public Boolean DeleteStudent();

	public Boolean DeleteTrainer();

	public Course CreateCourse();

	public Course UpdateCourse();

	public Boolean DeleteCourse();

}
