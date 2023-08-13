package com.demoqa.tests;

import com.demoqa.pages.RegistrationPage;
import org.junit.jupiter.api.Test;

public class PracticeFormPageObjectsTests extends TestBase{

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void successfulFillFormTest() {

        registrationPage.openPage()
                        .closeAdBanners()
                        .setFirstName("TestFirstName")
                        .setLastName("TestLastName")
                        .setUserEmail("test@gmail.com")
                        .setGender("Male")
                        .setUserNumber("0123456789")
                        .setBirthDate("13", "May", "1990")
                        .setSubject("Physics")
                        .setSubject("Computer Science")
                        .setHobby("Sports")
                        .setHobby("Music")
                        .selectPicture("Screenshot.png")
                        .setCurrentAddress("Kuta, Bali")
                        .setStateAndCity("Uttar Pradesh", "Merrut")
                        .clickOnSubmitButton();

        registrationPage.verifyRegistrationResultModalAppears()
                .verifyResult("Student Name", "TestFirstName TestLastName")
                .verifyResult("Student Email", "test@gmail.com")
                .verifyResult("Gender", "Male")
                .verifyResult("Mobile", "0123456789")
                .verifyResult("Date of Birth", "13 May,1990")
                .verifyResult("Subjects", "Physics, Computer Science")
                .verifyResult("Hobbies", "Sports, Music")
                .verifyResult("Picture", "Screenshot.png")
                .verifyResult("Address", "Kuta, Bali")
                .verifyResult("State and City", "Uttar Pradesh Merrut");

    }
}
