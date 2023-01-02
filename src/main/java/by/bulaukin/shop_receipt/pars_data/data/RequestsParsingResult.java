package by.bulaukin.shop_receipt.pars_data.data;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class RequestsParsingResult {

    private List<ItemsFromRequest> itemsList = new ArrayList<>();
    private Integer cardNumber;

    public List<ItemsFromRequest> getItemsList() {
        return itemsList;
    }
}
