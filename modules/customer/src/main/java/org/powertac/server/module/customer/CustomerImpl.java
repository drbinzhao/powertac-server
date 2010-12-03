package org.powertac.server.module.customer;

import org.powertac.common.commands.*;
import org.powertac.common.interfaces.Customer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CustomerImpl implements Customer {

    public CustomerImpl() {
        loadProfile = new BigDecimal[24];
        loadProfile[0] = new BigDecimal("0.2582");
        loadProfile[1] = new BigDecimal("0.1816");
        loadProfile[2] = new BigDecimal("0.1599");
        loadProfile[3] = new BigDecimal("0.1548");
        loadProfile[4] = new BigDecimal("0.1548");
        loadProfile[5] = new BigDecimal("0.1717");
        loadProfile[6] = new BigDecimal("0.3046");
        loadProfile[7] = new BigDecimal("0.4943");
        loadProfile[8] = new BigDecimal("0.5381");
        loadProfile[9] = new BigDecimal("0.5045");
        loadProfile[10] = new BigDecimal("0.4682");
        loadProfile[11] = new BigDecimal("0.4675");
        loadProfile[12] = new BigDecimal("0.5095");
        loadProfile[13] = new BigDecimal("0.5287");
        loadProfile[14] = new BigDecimal("0.4747");
        loadProfile[15] = new BigDecimal("0.4276");
        loadProfile[16] = new BigDecimal("0.4134");
        loadProfile[17] = new BigDecimal("0.4822");
        loadProfile[18] = new BigDecimal("0.6281");
        loadProfile[19] = new BigDecimal("0.7407");
        loadProfile[20] = new BigDecimal("0.7037");
        loadProfile[21] = new BigDecimal("0.5863");
        loadProfile[22] = new BigDecimal("0.4942");
        loadProfile[23] = new BigDecimal("0.3764");


    }

    @Override
    public List<TariffReplyCommand> processTariffList(List<TariffPublishedCommand> tariffPublishedCommandList) {
        /*TariffPublishedCommand bestTariffPublished = null;
        BigDecimal currentMaxUtility = new BigDecimal(0);
        for (TariffPublishedCommand tariffPublishedCommand : tariffPublishedCommandList) {
            if (getUtility(tariffPublishedCommand).compareTo(currentMaxUtility) > 0) {
                bestTariffPublished = tariffPublishedCommand;
            }
        }*/

        // Demo implementation. Returns empty list.
        ArrayList<TariffReplyCommand> tariffChoice = new ArrayList<TariffReplyCommand>();
        TariffReplyCommand bestTariffReply = new TariffReplyCommand();
        //tariffChoice.add(bestTariffPublished); //TODO: we need a simple way to convert TariffPublishedCommands into TariffReplyCommands
        //bestTariffReply = TariffParser.convert(bestTariffPublished)
        tariffChoice.add(bestTariffReply);
        return (tariffChoice);
    }

    private BigDecimal[] loadProfile;
    private BigDecimal[] consumptionPlan;

    private BigDecimal getUtility(TariffPublishedCommand tariffPublishedCommand) {
        return null;
    }

    @Override
    public MeterReadingCommand generateMeterReading(TimeslotUpdatedCommand timeslotUpdatedCommand) {
        return null;
    }

    @Override
    public CustomerInfoCommand generateCustomerInfo() {
        return null;
    }

}
