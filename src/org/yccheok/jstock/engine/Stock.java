/*
 * JStock - Free Stock Market Software
 * Copyright (C) 2010 Yan Cheng CHEOK <yccheok@yahoo.com>
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package org.yccheok.jstock.engine;

/**
 *
 * @author yccheok
 */
public class Stock {
    
    /** Creates a new instance of Stock */
    public Stock(
        Code code,
        Symbol symbol,
        String name,
        Board board,
        Industry industry,
        double prevPrice,
        double openPrice,
        double lastPrice,
        double highPrice,
        double lowPrice,
        // TODO: CRITICAL LONG BUG REVISED NEEDED.
        long volume,
        double changePrice,
        double changePricePercentage,
        int lastVolume,
        double buyPrice,
        int buyQuantity,
        double sellPrice,
        int sellQuantity,
        double secondBuyPrice,
        int secondBuyQuantity,
        double secondSellPrice,
        int secondSellQuantity,
        double thirdBuyPrice,
        int thirdBuyQuantity,
        double thirdSellPrice,
        int thirdSellQuantity,
        java.util.Calendar calendar
                ) 
    {
        this.code = code;
        this.symbol = symbol;
        this.name = name;
        this.board = board;
        this.industry = industry;
        this.prevPrice = prevPrice;
        this.openPrice = openPrice;
        this.lastPrice = lastPrice;
        this.highPrice = highPrice;
        this.lowPrice = lowPrice;
        this.volume = volume;
        this.changePrice = changePrice;
        this.changePricePercentage = changePricePercentage;
        this.lastVolume = lastVolume;
        this.buyPrice = buyPrice;
        this.buyQuantity = buyQuantity;
        this.sellPrice = sellPrice;
        this.sellQuantity = sellQuantity;
        this.secondBuyPrice = secondBuyPrice;
        this.secondBuyQuantity = secondBuyQuantity;
        this.secondSellPrice = secondSellPrice;
        this.secondSellQuantity = secondSellQuantity;
        this.thirdBuyPrice = thirdBuyPrice;
        this.thirdBuyQuantity = thirdBuyQuantity;
        this.thirdSellPrice = thirdSellPrice;
        this.thirdSellQuantity = thirdSellQuantity;
        this.calendar = calendar;
    }
    
    public Stock(Stock stock) {
        this.code = stock.code;
        this.symbol = stock.symbol;
        this.name = stock.name;
        this.board = stock.board;
        this.industry = stock.industry;
        this.prevPrice = stock.prevPrice;
        this.openPrice = stock.openPrice;
        this.lastPrice = stock.lastPrice;
        this.highPrice = stock.highPrice;
        this.lowPrice = stock.lowPrice;
        this.volume = stock.volume;
        this.changePrice = stock.changePrice;
        this.changePricePercentage = stock.changePricePercentage;
        this.lastVolume = stock.lastVolume;
        this.buyPrice = stock.buyPrice;
        this.buyQuantity = stock.buyQuantity;
        this.sellPrice = stock.sellPrice;
        this.sellQuantity = stock.sellQuantity;
        this.secondBuyPrice = stock.secondBuyPrice;
        this.secondBuyQuantity = stock.secondBuyQuantity;
        this.secondSellPrice = stock.secondSellPrice;
        this.secondSellQuantity = stock.secondSellQuantity;
        this.thirdBuyPrice = stock.thirdBuyPrice;
        this.thirdBuyQuantity = stock.thirdBuyQuantity;
        this.thirdSellPrice = stock.thirdSellPrice;
        this.thirdSellQuantity = stock.thirdSellQuantity;
        this.calendar = stock.calendar;
    }
    
    public Code getCode() {
        return code;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public Board getBoard() {
        return board;
    }
    
    public Industry getIndustry() {
        return industry;
    }

    public double getPrevPrice() {
        return prevPrice;
    }

    public double getOpenPrice() {
        return openPrice;
    }

    public double getLastPrice() {
        return lastPrice;
    }

    public double getHighPrice() {
        return highPrice;
    }

    public double getLowPrice() {
        return lowPrice;
    }

    // TODO: CRITICAL LONG BUG REVISED NEEDED.
    public long getVolume() {
        return volume;
    }

    public double getChangePrice() {
        return changePrice;
    }

    public double getChangePricePercentage() {
        return changePricePercentage;
    }

    public int getLastVolume() {
        return lastVolume;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public int getBuyQuantity() {
        return buyQuantity;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public int getSellQuantity() {
        return sellQuantity;
    }
    
    public double getSecondBuyPrice() {
        return secondBuyPrice;
    }
    
    public int getSecondBuyQuantity() {
        return secondBuyQuantity;
    }
    
    public double getSecondSellPrice() {
        return secondSellPrice;
    }
    
    public int getSecondSellQuantity() {
        return secondSellQuantity;
    }
    
    public double getThirdBuyPrice() {
        return thirdBuyPrice;
    }
    
    public int getThirdBuyQuantity() {
        return thirdBuyQuantity;
    }
    
    public double getThirdSellPrice() {
        return thirdSellPrice;
    }
    
    public int getThirdSellQuantity() {
        return thirdSellQuantity;
    }
    
    public java.util.Calendar getCalendar() {
        return (java.util.Calendar)calendar.clone();        
    }

    /**
     * Returns a clone copy of this stock with its symbol being modified to
     * specified symbol. This stock remains unchanged, as it is designed as
     * immutable class.
     *
     * @param symbol Specified symbol to be modified to
     * @return A clone copy of this stock with its symbol being modified to
     * specified symbol.
     */
    public Stock deriveStock(Symbol symbol) {
        return new Stock(
            this.code,
            symbol,
            this.name,
            this.board,
            this.industry,
            this.prevPrice,
            this.openPrice,
            this.lastPrice,
            this.highPrice,
            this.lowPrice,
            // TODO: CRITICAL LONG BUG REVISED NEEDED.
            this.volume,
            this.changePrice,
            this.changePricePercentage,
            this.lastVolume,
            this.buyPrice,
            this.buyQuantity,
            this.sellPrice,
            this.sellQuantity,
            this.secondBuyPrice,
            this.secondBuyQuantity,
            this.secondSellPrice,
            this.secondSellQuantity,
            this.thirdBuyPrice,
            this.thirdBuyQuantity,
            this.thirdSellPrice,
            this.thirdSellQuantity,
            this.calendar
        );
    }

    @Override
    public String toString() {
        return Stock.class.getName() + "[code=" + code + ",symbol=" + symbol + ",name=" + name + ",board=" + board + ",industry=" + industry +
                ",prevPrice=" + prevPrice + ",openPrice=" + openPrice + ",lastPrice=" + lastPrice + ",highPrice=" + highPrice + ",lowPrice=" + lowPrice +
                ",volume=" + volume + ",changePrice=" + changePrice + ",changePricePercentage=" + changePricePercentage + ",lastVolume=" + lastVolume +
                ",buyPrice=" + buyPrice + ",buyQuantity=" + buyQuantity + ",sellPrice=" + sellPrice + ",sellQuantity" + sellQuantity +
                ",secondBuyPrice=" + secondBuyPrice + ",secondBuyQuantity=" + secondBuyQuantity + ",secondSellPrice=" + secondSellPrice + ",secondSellQuantity" + secondSellQuantity +
                ",thirdBuyPrice=" + thirdBuyPrice + ",thirdBuyQuantity=" + thirdBuyQuantity + ",thirdSellPrice=" + thirdSellPrice + ",thirdSellQuantity" + thirdSellQuantity +
                ",calendar=" + calendar + "]"
                ;
    }
    
    public enum Board {
                                                // The following are naming conventions from CIMB :
        Main("Main Board"),                     // Main
        Second("Second Board"),                 // 2nd
        Mesdaq("Mesdaq"),                       // MESDAQ
        CallWarrant("Call Warrant"),            // ??
        KualaLumpur("Kuala Lumpur"),
        SES("SES"),                             // Singapore
        Copenhagen("Copenhagen"),               // Denmark        
        Paris("Paris"),                         // France
        Xetra("Xetra"),                         // Germany
        XETRA("XETRA"),
        Munich("Munich"),
        Stuttgart("Stuttgart"),
        Berlin("Berlin"),
        Hamburg("Hamburg"),
        Dusseldorf("Dusseldorf"),
        Frankfurt("Frankfurt"),
        Hannover("Hannover"),
        Milan("Milan"),                         // Italy
        Oslo("Oslo"),                           // Norway
        Madrid("Madrid"),                       // Spain
        MCE("MCE"),
        MercadoContinuo("Mercado Continuo"),
        Stockholm("Stockholm"),                 // Sweden
        FSI("FSI"),                             // UK
        London("London"),
        NasdaqSC("NasdaqSC"),                   // US
        DJI("DJI"),
        NasdaqNM("NasdaqNM"),
        NYSE("NYSE"),
        Nasdaq("Nasdaq"),
        AMEX("AMEX"),
        PinkSheet("Pink Sheet"),
        Sydney("Sydney"),                       // Australia
        ASX("ASX"),
        Vienna("Vienna"),                       // Austria
        Brussels("Brussels"),                   // Belgium
        Toronto("Toronto"),                     // Canada
        HKSE("HKSE"),                           // Hong Kong
        Jakarta("Jakarta"),                     // Indonesia
        KSE("KSE"),                             // Korea
        KOSDAQ("KOSDAQ"),
        Amsterdam("Amsterdam"),                 // Netherlands
        ENX("ENX"),                             // Portugal
        Lisbon("Lisbon"),
        VTX("VTX"),                             // Switzerland
        Virt_X("Virt-X"),
        Switzerland("Switzerland"),
        Taiwan("Taiwan"),                       // Taiwan
        Bombay("Bombay"),                       // India
        NSE("NSE"),
        UserDefined("User Defined"),
        Unknown("Unknown");
        
        private final String name;

        Board(String name) {
            this.name = name;
        }
        
        @Override
        public String toString() {
            return name;
        }
    }
        
    public enum Industry {
                                                    // The following are naming conventions from CIMB :
        ConsumerProducts("Consumer Products"),      // CONSUMER
        IndustrialProducts("Industrial Products"),  // IND-PROD
        Construction("Construction"),               // CONSTRUCTN
        TradingServices("Trading / Services"),      // TRAD/SERV
        Technology("Technology"),                   // TECHNOLOGY
        Infrastructure("Infrastructure"),           // IPC
        Finance("Finance"),                         // FINANCE
        Hotels("Hotels"),                           // HOTELS
        Properties("Properties"),                   // PROPERTIES 
        Plantation("Plantation"),                   // PLANTATION
        Mining("Mining"),                           // MINING
        Trusts("Trusts"),                           // REITS
        CloseEndFund("Close-End Fund"),             // CLOSED/FUND 
        ETF("ETF"),                                 // ETF
        Loans("Loans"),                             // LOANS
        CallWarrant("Call Warrant"),                // CALL-WARR
        UserDefined("User Defined"),
        Unknown("Unknown");
        
        private final String name;

        Industry(String name) {
            this.name = name;
        }
        
        @Override
        public String toString() {
            return name;
        }
    }
            
    private final Code code;
    private final Symbol symbol;
    private final String name;
    private final Board board;
    private final Industry industry;
    private final double prevPrice;
    private final double openPrice;
    private final double lastPrice;    
    private final double highPrice;  
    private final double lowPrice;
    // TODO: CRITICAL LONG BUG REVISED NEEDED.
    private final long volume;
    private final double changePrice;
    private final double changePricePercentage;
    private final int lastVolume;    
    private final double buyPrice;
    private final int buyQuantity;    
    private final double sellPrice;
    private final int sellQuantity;
    private final double secondBuyPrice;
    private final int secondBuyQuantity;
    private final double secondSellPrice;
    private final int secondSellQuantity;
    private final double thirdBuyPrice;
    private final int thirdBuyQuantity;
    private final double thirdSellPrice;
    private final int thirdSellQuantity;
    private final java.util.Calendar calendar;
}
