import org.junit.Assert;
import org.junit.Test;
import ru.netology.CashbackHackService;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void ShouldCalculateMoneyWhenAmountLessThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 550;
        int expected = 450;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void ShouldCalculateMoneyWhenAmountEqualBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void ShouldCalculateMoneyWhenAmountMoreBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int expected = 999;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }
}