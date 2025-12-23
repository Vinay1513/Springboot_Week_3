INSERT INTO patient (name, gender, birth_date, email, blood_group)
VALUES
    ('Aarav Sharma', 'MALE', '1990-05-10', 'aarav.sharma@example.com', 'O_POSITIVE'),
    ('Diya Patel', 'FEMALE', '1995-08-20', 'diya.patel@example.com', 'A_POSITIVE'),
    ('Dishant Verma', 'MALE', '1988-03-15', 'dishant.verma@example.com', 'A_POSITIVE'),
    ('Neha Iyer', 'FEMALE', '1992-12-01', 'neha.iyer@example.com', 'AB_POSITIVE'),
    ('Kabir Singh', 'MALE', '1993-07-11', 'kabir.singh@example.com', 'O_POSITIVE');

INSERT INTO doctor (name, specialization, email)
VALUES
    ('Dr. Rakesh Mehta', 'Cardiology', 'rakesh.mehta@example.com'),
    ('Dr. Sneha Kapoor', 'Dermatology', 'sneha.kapoor@example.com'),
    ('Dr. Arjun Nair', 'Orthopedics', 'arjun.nair@example.com');


INSERT INTO appointment (appointment_time, reason, patient_id, doctor_id)
VALUES
('2025-12-23 10:30:00', 'Regular heart checkup', 1, 1),
('2025-12-23 11:15:00', 'Skin allergy consultation', 2, 2),
('2025-12-24 09:00:00', 'Knee pain follow-up', 3, 3),
('2025-12-24 10:00:00', 'Routine health check', 4, 1),
('2025-12-25 12:30:00', 'Back pain consultation', 5, 3);




