package lv.venta.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import lv.venta.demo.models.Grade;
import lv.venta.demo.models.Professor;
import lv.venta.demo.models.Student;
import lv.venta.demo.models.Subject;
import lv.venta.demo.repos.IGradeRepo;
import lv.venta.demo.repos.IProfessorRepo;
import lv.venta.demo.repos.IStudentRepo;
import lv.venta.demo.repos.ISubjectRepo;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}
	
	@Bean
	public CommandLineRunner runner (IProfessorRepo professorRepo,
			IStudentRepo studentRepo, ISubjectRepo subjectRepo, IGradeRepo gradeRepo)
	
	{
		
		return new CommandLineRunner() {
			
			@Override
			public void run(String... args) throws Exception {
				Professor prof1 = new Professor("Karina", "Skirmante", "Mg.sc.comp");
                Professor prof2 = new Professor("Raita", "Rollande", "Dr.ing");
                professorRepo.save(prof1);
                professorRepo.save(prof1);
                
                Student stud1 = new Student("Janis", "Berzins");
                Student stud2 = new Student("Baiba", "Jauka");
                studentRepo.save(stud1);
                studentRepo.save(stud2);
                
                Subject sub1 = new Subject("JAVA", 4, prof1);
                Subject sub2 = new Subject("ProgInz", 4, prof2);
                subjectRepo.save(sub1);
                subjectRepo.save(sub1);
                
                
                gradeRepo.save(new Grade(10, sub1, stud1));
                gradeRepo.save(new Grade(3, sub1, stud1));
                gradeRepo.save(new Grade(5, sub2, stud2));
                gradeRepo.save(new Grade(7, sub2, stud2));
				
						


			}
		};
		
	}

}
