//package test.AST;
//
//import AST.*;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import libs.Tokenizer;
//
//import java.util.List;
//
//class parserTest {
//    Program prog = new Program();
//    Tokenizer tokenizer;
//
//    @BeforeEach
//    void init() {
//        prog = new Program();
//        tokenizer = new Tokenizer(null,null);
//    }
//
//    void getCalendarInfo(NewCalendar cal) {
//        List<Event> events = cal.getEvents();
//        Object calTitle = cal.getTitle().getTitle();
//        System.out.println("calendar title: " + calTitle);
//        for (Event event: events) {
//            System.out.println("New event: " + event.hashCode());
//            String eventTitle = event.getTitle();
//            Object eventOccurrence = event.getOccurrence();
//            String eventDescrip = event.getDescription();
//            String eventLocation = event.getLocation();
//            String eventRepeat = event.getRepeat();
//            String eventGroupTitle = event.getGroupTitle();
//            List<String> eventGroupEvents = event.getGroupEvents();
//            System.out.println("title: " + eventTitle);
//            System.out.println("occurence: " + eventOccurrence);
//            System.out.println("description: " + eventDescrip);
//            System.out.println("location: " + eventLocation);
//            System.out.println("repeat: " + eventRepeat);
//            System.out.println("group title: " + eventGroupTitle);
//            System.out.println("group events: " + eventGroupEvents);
//        }
//    }
//
//    @Test
//    void simpleTest() {
//        String[] tokens = {"new calendar", "my calendar!!", ";",
//                "new event", "big day", ";",
//                "<", "monday", ">",
//                "description:", "blah", ";",
//                "event end",
//                "end"};
//        tokenizer = new Tokenizer(tokens);
//        prog.parse();
//        NewCalendar cal = prog.getCalendar();
//        getCalendarInfo(cal);
//    }
//
//    @Test
//    void testLocation() {
//        String[] tokens = {"new calendar", "my calendar!!", ";",
//                "new event", "big day", ";",
//                "<", "monday", ">",
//                "description:", "blah", ";",
//                "location:", "wherever", ";",
//                "event end",
//                "end"};
//        tokenizer = new Tokenizer(tokens);
//        prog.parse();
//        NewCalendar cal = prog.getCalendar();
//        getCalendarInfo(cal);
//    }
//
//    @Test
//    void testRepeatMWF() {
//        String[] tokens = {"new calendar", "my calendar!!", ";",
//                "new event", "big day", ";",
//                "<", "monday", ">",
//                "description:", "blah", ";",
//                "location:", "wherever", ";",
//                "repeat:", "MWF", ";",
//                "event end",
//                "end"};
//        tokenizer = new Tokenizer(tokens);
//        prog.parse();
//        NewCalendar cal = prog.getCalendar();
//        getCalendarInfo(cal);
//    }
//    @Test
//    void testOccurenceDayRange() {
//        String[] tokens = {"new calendar", "my calendar!!", ";",
//                "new event", "big day", ";",
//                "<", "from", "monday", "to", "wednesday", ">",
//                "description:", "blah", ";",
//                "location:", "wherever", ";",
//                "event end",
//                "end"};
//        tokenizer = new Tokenizer(tokens);
//        prog.parse();
//        NewCalendar cal = prog.getCalendar();
//        getCalendarInfo(cal);
//    }
//
//    @Test
//    void testOccurenceTime() {
//            String[] tokens = {"new calendar", "my calendar!!", ";",
//                    "new event", "big day", ";",
//                    "<", "at", "12", ":", "30", ">",
//                    "description:", "blah", ";",
//                    "location:", "wherever", ";",
//                    "repeat:", "MWF", ";",
//                    "event end",
//                    "end"};
//            tokenizer = new Tokenizer(tokens);
//            prog.parse();
//            NewCalendar cal = prog.getCalendar();
//            getCalendarInfo(cal);
//    }
//
//    @Test
//    void testOccurenceTimeRangeWithDay() {
//        String[] tokens = {"new calendar", "my calendar!!", ";",
//            "new event", "big day", ";",
//            "<", "on", "monday", "start", "at", "12", ":", "30", "finish", "at", "14", ":", "30", ">",
//            "description:", "blah", ";",
//            "location:", "wherever", ";",
//            "event end",
//            "end"};
//        tokenizer = new Tokenizer(tokens);
//        prog.parse();
//        NewCalendar cal = prog.getCalendar();
//        getCalendarInfo(cal);
//    }
//
//    @Test
//    void testOccurenceTimeRangeWithoutDay() {
//        String[] tokens = {"new calendar", "my calendar!!", ";",
//                "new event", "big day", ";",
//                "<", "start", "at", "12", ":", "30", "finish", "at", "14", ":", "30", ">",
//                "description:", "blah", ";",
//                "location:", "wherever", ";",
//                "event end",
//                "end"};
//        tokenizer = new Tokenizer(tokens);
//        prog.parse();
//        NewCalendar cal = prog.getCalendar();
//        getCalendarInfo(cal);
//    }
//
//    @Test
//    void testAllFieldsExceptGroup() {
//        String[] tokens = {"new calendar", "my calendar!!", ";",
//                "new event", "big day", ";",
//                "<", "on", "saturday", "start", "at", "10", ":", "30", "finish", "at", "12", ":", "00", ">",
//                "description:", "blah blah blah", ";",
//                "location:", "wherever", ";",
//                "repeat:", "daily", ";",
//                "event end",
//                "end"};
//        tokenizer = new Tokenizer(tokens);
//        prog.parse();
//        NewCalendar cal = prog.getCalendar();
//        getCalendarInfo(cal);
//    }
//
//    @Test
//    void testMultipleEvents() {
//        String[] tokens = {"new calendar", "my calendar!!", ";",
//                "new event", "big day", ";",
//                "<", "monday", ">",
//                "description:", "blah", ";",
//                "event end",
//                "new event", "big day", ";",
//                "<", "on", "monday", "start", "at", "12", ":", "30", "finish", "at", "14", ":", "30", ">",
//                "description:", "blah", ";",
//                "location:", "wherever", ";",
//                "event end", "end" };
//        tokenizer = new Tokenizer(tokens);
//        prog.parse();
//        NewCalendar cal = prog.getCalendar();
//        getCalendarInfo(cal);
//    }
//}
