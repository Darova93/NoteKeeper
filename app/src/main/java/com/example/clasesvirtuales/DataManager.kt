package com.example.clasesvirtuales

object DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
        initializeNotes()
    }

    private fun initializeCourses() {
        var course = CourseInfo("android_intents", "Android Programming with Intents")
        courses[course.courseId] = course

        course  = CourseInfo(courseId = "android_async", title = "Android  Async Programming and Services")
        courses[course.courseId] = course

        course = CourseInfo(title = "Java Fundamentals: The Java Language", courseId = "java_lang")
        courses[course.courseId] = course

        course = CourseInfo("java_core", "Java Fundamentals: The Core Platform")
        courses[course.courseId] = course
    }

    private fun initializeNotes() {
        var note = NoteInfo(CourseInfo("android_intents", "Android Programming with Intents"), "Dynamic intent resolution", "Wow, intents allow components to be resolved at runtime")
        notes.add(note)
        note = NoteInfo(CourseInfo("android_async", "Android  Async Programming and Services"), "Test", "Test 2")
        notes.add(note)
    }
}