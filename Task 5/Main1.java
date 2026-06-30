class Patient {
    String name, nationalId;

    Patient(String name, String nationalId) {
        this.name = name;
        this.nationalId = nationalId;
    }
}

class IdValidator {
    boolean validateId(String id) {
        return id.length() == 10 || id.length() == 17;
    }
}

class SmsService {
    void sendSms(Patient patient) {
        IdValidator validator = new IdValidator();

        if (validator.validateId(patient.nationalId))
            System.out.println("Sending SMS to " + patient.name + ": Registration successful.");
        else
            System.out.println("Invalid National ID.");
    }
}

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("Ali Ahmed", "1234567890");
        SmsService sms = new SmsService();
        sms.sendSms(patient);
    }
}
