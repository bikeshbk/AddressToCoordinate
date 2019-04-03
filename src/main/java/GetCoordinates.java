import java.time.LocalDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Map;

public class GetCoordinates {
    public static void main(String[] args) {
        String address = "Australia Ave, Sydney Olympic Park NSW 2127, Australia";
        Map<String, Double> coords;
        coords = OpenStreetMapUtils.getInstance().getCoordinates(address);
        System.out.println("latitude :" + coords.get("lat"));
        System.out.println("longitude:" + coords.get("lon"));
        LocalDateTime now = LocalDateTime.now();
        ZoneId zone = ZoneId.of("Africa/El_Aaiun");
        ZoneOffset zoneOffSet = zone.getRules().getOffset(now);

        OffsetDateTime time = OffsetDateTime.now(zoneOffSet);

        System.out.print(time);
    }
}
