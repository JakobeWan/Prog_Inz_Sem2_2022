package lv.venta.demo.models;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
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
public class Student {
        
        //1.mainigie
        
        @Setter(value=AccessLevel.NONE)
        @Column(name="IdSt")
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        
        private int idSt;
        
        @Column (name="Name")
        private String name;
        
        @Column (name="Surname")
        private String surname;
        
        
        @OneToMany (mappedBy = "student")
        @ToString.Exclude
        private ArrayList<Grade> grades;
        
        
        
        
        
        
        
        public Student(String name, String surname) {
                this.name = name;
                this.surname = surname;
                
        }
        
        
        
        
        
        

}