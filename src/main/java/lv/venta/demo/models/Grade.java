package lv.venta.demo.models;

import javax.management.loading.PrivateClassLoader;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Table
@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Grade {
        
        @Setter(value=AccessLevel.NONE)
        @Column(name="IdGr")
        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        private int idGr;
        
        
        @Column(name = "GradeValue")
        private int gradeValue;
        
        @ManyToOne
        @JoinColumn (name = "IdSubj")
        private Subject subject;
        
        @ManyToOne
        @JoinColumn (name = "IdSt")
        private Student student;

		public Grade(int gradeValue, Subject subject, Student student) {
			super();
			this.gradeValue = gradeValue;
			this.subject = subject;
			this.student = student;
		}
        
        
        
        
        
        
}