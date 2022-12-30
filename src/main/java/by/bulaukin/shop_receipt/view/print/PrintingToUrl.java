package by.bulaukin.shop_receipt.view.print;

import by.bulaukin.shop_receipt.view.ReceiptsView;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
@RequiredArgsConstructor
@Log4j2
public class PrintingToUrl implements PrintingViews{

    private final ReceiptsView receiptsView;
    private final ModelAndView modelAndView;
    @Override
    public void printViews() {
        modelAndView.addObject("receipt", receiptsView);
        log.debug("Printing view" + modelAndView.getModel().get("receipt"));
    }
}
