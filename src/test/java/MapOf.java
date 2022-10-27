import org.apache.commons.lang.StringUtils;

import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;

public class MapOf {

    private  static String vanila = "";
    public static void main(String[] args)
    {



    }

    public Map<String, Consumer<?>> getPatrnet()
    {
       return  Map.of("Terms and condition",
                v -> vanila = Optional.ofNullable("aksnaksn").orElse(StringUtils.EMPTY)
        );
    }
}
