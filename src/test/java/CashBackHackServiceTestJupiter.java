import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.CashbackHackService;

import static org.junit.Assert.assertEquals;

public class CashBackHackServiceTestJupiter {
    @Test
    public void ShouldCalculateMoneyWhenAmountLessThanBoundaryWithJunitJupiter() {
        CashbackHackService service = new CashbackHackService();
        int amount = 520;
        int expected = 480;
        int actual = service.remain(amount);

        Assertions.assertEquals(expected, actual);
    }
}
