package com.pavi.learning.java.testdatetime;

import java.time.LocalDate;
import java.time.Period;

    public class DateTimeFormat {

        private LocalDate dateOfBirth;

        public LocalDate getDob() {
            return dateOfBirth;
        }

        public void setDob(LocalDate dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }

        public Period calculateAge() {

            LocalDate today = LocalDate.now();

            return Period.between(dateOfBirth, today);
        }
    }

