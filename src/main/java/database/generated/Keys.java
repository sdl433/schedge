/*
 * This file is generated by jOOQ.
 */
package database.generated;


import database.generated.tables.Courses;
import database.generated.tables.FlywaySchemaHistory;
import database.generated.tables.Meetings;
import database.generated.tables.Sections;
import database.generated.tables.records.CoursesRecord;
import database.generated.tables.records.FlywaySchemaHistoryRecord;
import database.generated.tables.records.MeetingsRecord;
import database.generated.tables.records.SectionsRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>public</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<CoursesRecord, Integer> IDENTITY_COURSES = Identities0.IDENTITY_COURSES;
    public static final Identity<MeetingsRecord, Integer> IDENTITY_MEETINGS = Identities0.IDENTITY_MEETINGS;
    public static final Identity<SectionsRecord, Integer> IDENTITY_SECTIONS = Identities0.IDENTITY_SECTIONS;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<CoursesRecord> COURSES_ID_KEY = UniqueKeys0.COURSES_ID_KEY;
    public static final UniqueKey<CoursesRecord> COURSES_PKEY = UniqueKeys0.COURSES_PKEY;
    public static final UniqueKey<FlywaySchemaHistoryRecord> FLYWAY_SCHEMA_HISTORY_PK = UniqueKeys0.FLYWAY_SCHEMA_HISTORY_PK;
    public static final UniqueKey<MeetingsRecord> MEETINGS_PKEY = UniqueKeys0.MEETINGS_PKEY;
    public static final UniqueKey<SectionsRecord> SECTIONS_ID_KEY = UniqueKeys0.SECTIONS_ID_KEY;
    public static final UniqueKey<SectionsRecord> SECTIONS_PKEY = UniqueKeys0.SECTIONS_PKEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<CoursesRecord, Integer> IDENTITY_COURSES = Internal.createIdentity(Courses.COURSES, Courses.COURSES.ID);
        public static Identity<MeetingsRecord, Integer> IDENTITY_MEETINGS = Internal.createIdentity(Meetings.MEETINGS, Meetings.MEETINGS.ID);
        public static Identity<SectionsRecord, Integer> IDENTITY_SECTIONS = Internal.createIdentity(Sections.SECTIONS, Sections.SECTIONS.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<CoursesRecord> COURSES_ID_KEY = Internal.createUniqueKey(Courses.COURSES, "courses_id_key", Courses.COURSES.ID);
        public static final UniqueKey<CoursesRecord> COURSES_PKEY = Internal.createUniqueKey(Courses.COURSES, "courses_pkey", Courses.COURSES.TERM_ID, Courses.COURSES.SCHOOL, Courses.COURSES.SUBJECT, Courses.COURSES.DEPT_COURSE_NUMBER);
        public static final UniqueKey<FlywaySchemaHistoryRecord> FLYWAY_SCHEMA_HISTORY_PK = Internal.createUniqueKey(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY, "flyway_schema_history_pk", FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_RANK);
        public static final UniqueKey<MeetingsRecord> MEETINGS_PKEY = Internal.createUniqueKey(Meetings.MEETINGS, "meetings_pkey", Meetings.MEETINGS.ID);
        public static final UniqueKey<SectionsRecord> SECTIONS_ID_KEY = Internal.createUniqueKey(Sections.SECTIONS, "sections_id_key", Sections.SECTIONS.ID);
        public static final UniqueKey<SectionsRecord> SECTIONS_PKEY = Internal.createUniqueKey(Sections.SECTIONS, "sections_pkey", Sections.SECTIONS.COURSE_ID, Sections.SECTIONS.SECTION_CODE);
    }
}
