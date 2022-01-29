package org.xtext.example.bts.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.bts.services.BTSGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBTSParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ARRIVAL_POINT'", "'DEPARTURE_POINT'", "'Baggage'", "'Booking'", "'Ticket'", "'Passenger'", "'Payment'", "'OnlinePayment'", "'{'", "'}'", "'extends'", "'KIOSK'", "'Bus'", "'City'", "'Seat'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalBTSParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBTSParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBTSParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBTS.g"; }


    	private BTSGrammarAccess grammarAccess;

    	public void setGrammarAccess(BTSGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleBTS"
    // InternalBTS.g:53:1: entryRuleBTS : ruleBTS EOF ;
    public final void entryRuleBTS() throws RecognitionException {
        try {
            // InternalBTS.g:54:1: ( ruleBTS EOF )
            // InternalBTS.g:55:1: ruleBTS EOF
            {
             before(grammarAccess.getBTSRule()); 
            pushFollow(FOLLOW_1);
            ruleBTS();

            state._fsp--;

             after(grammarAccess.getBTSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBTS"


    // $ANTLR start "ruleBTS"
    // InternalBTS.g:62:1: ruleBTS : ( ( rule__BTS__ElementsAssignment )* ) ;
    public final void ruleBTS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:66:2: ( ( ( rule__BTS__ElementsAssignment )* ) )
            // InternalBTS.g:67:2: ( ( rule__BTS__ElementsAssignment )* )
            {
            // InternalBTS.g:67:2: ( ( rule__BTS__ElementsAssignment )* )
            // InternalBTS.g:68:3: ( rule__BTS__ElementsAssignment )*
            {
             before(grammarAccess.getBTSAccess().getElementsAssignment()); 
            // InternalBTS.g:69:3: ( rule__BTS__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=13 && LA1_0<=18)||(LA1_0>=22 && LA1_0<=25)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBTS.g:69:4: rule__BTS__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__BTS__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getBTSAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBTS"


    // $ANTLR start "entryRuleType"
    // InternalBTS.g:78:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalBTS.g:79:1: ( ruleType EOF )
            // InternalBTS.g:80:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalBTS.g:87:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:91:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalBTS.g:92:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalBTS.g:92:2: ( ( rule__Type__Alternatives ) )
            // InternalBTS.g:93:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalBTS.g:94:3: ( rule__Type__Alternatives )
            // InternalBTS.g:94:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleBaggage"
    // InternalBTS.g:103:1: entryRuleBaggage : ruleBaggage EOF ;
    public final void entryRuleBaggage() throws RecognitionException {
        try {
            // InternalBTS.g:104:1: ( ruleBaggage EOF )
            // InternalBTS.g:105:1: ruleBaggage EOF
            {
             before(grammarAccess.getBaggageRule()); 
            pushFollow(FOLLOW_1);
            ruleBaggage();

            state._fsp--;

             after(grammarAccess.getBaggageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBaggage"


    // $ANTLR start "ruleBaggage"
    // InternalBTS.g:112:1: ruleBaggage : ( ( rule__Baggage__Group__0 ) ) ;
    public final void ruleBaggage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:116:2: ( ( ( rule__Baggage__Group__0 ) ) )
            // InternalBTS.g:117:2: ( ( rule__Baggage__Group__0 ) )
            {
            // InternalBTS.g:117:2: ( ( rule__Baggage__Group__0 ) )
            // InternalBTS.g:118:3: ( rule__Baggage__Group__0 )
            {
             before(grammarAccess.getBaggageAccess().getGroup()); 
            // InternalBTS.g:119:3: ( rule__Baggage__Group__0 )
            // InternalBTS.g:119:4: rule__Baggage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Baggage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBaggageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBaggage"


    // $ANTLR start "entryRuleBooking"
    // InternalBTS.g:128:1: entryRuleBooking : ruleBooking EOF ;
    public final void entryRuleBooking() throws RecognitionException {
        try {
            // InternalBTS.g:129:1: ( ruleBooking EOF )
            // InternalBTS.g:130:1: ruleBooking EOF
            {
             before(grammarAccess.getBookingRule()); 
            pushFollow(FOLLOW_1);
            ruleBooking();

            state._fsp--;

             after(grammarAccess.getBookingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooking"


    // $ANTLR start "ruleBooking"
    // InternalBTS.g:137:1: ruleBooking : ( ( rule__Booking__Group__0 ) ) ;
    public final void ruleBooking() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:141:2: ( ( ( rule__Booking__Group__0 ) ) )
            // InternalBTS.g:142:2: ( ( rule__Booking__Group__0 ) )
            {
            // InternalBTS.g:142:2: ( ( rule__Booking__Group__0 ) )
            // InternalBTS.g:143:3: ( rule__Booking__Group__0 )
            {
             before(grammarAccess.getBookingAccess().getGroup()); 
            // InternalBTS.g:144:3: ( rule__Booking__Group__0 )
            // InternalBTS.g:144:4: rule__Booking__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Booking__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBookingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooking"


    // $ANTLR start "entryRuleTicket"
    // InternalBTS.g:153:1: entryRuleTicket : ruleTicket EOF ;
    public final void entryRuleTicket() throws RecognitionException {
        try {
            // InternalBTS.g:154:1: ( ruleTicket EOF )
            // InternalBTS.g:155:1: ruleTicket EOF
            {
             before(grammarAccess.getTicketRule()); 
            pushFollow(FOLLOW_1);
            ruleTicket();

            state._fsp--;

             after(grammarAccess.getTicketRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTicket"


    // $ANTLR start "ruleTicket"
    // InternalBTS.g:162:1: ruleTicket : ( ( rule__Ticket__Group__0 ) ) ;
    public final void ruleTicket() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:166:2: ( ( ( rule__Ticket__Group__0 ) ) )
            // InternalBTS.g:167:2: ( ( rule__Ticket__Group__0 ) )
            {
            // InternalBTS.g:167:2: ( ( rule__Ticket__Group__0 ) )
            // InternalBTS.g:168:3: ( rule__Ticket__Group__0 )
            {
             before(grammarAccess.getTicketAccess().getGroup()); 
            // InternalBTS.g:169:3: ( rule__Ticket__Group__0 )
            // InternalBTS.g:169:4: rule__Ticket__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ticket__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTicketAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTicket"


    // $ANTLR start "entryRulePassenger"
    // InternalBTS.g:178:1: entryRulePassenger : rulePassenger EOF ;
    public final void entryRulePassenger() throws RecognitionException {
        try {
            // InternalBTS.g:179:1: ( rulePassenger EOF )
            // InternalBTS.g:180:1: rulePassenger EOF
            {
             before(grammarAccess.getPassengerRule()); 
            pushFollow(FOLLOW_1);
            rulePassenger();

            state._fsp--;

             after(grammarAccess.getPassengerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePassenger"


    // $ANTLR start "rulePassenger"
    // InternalBTS.g:187:1: rulePassenger : ( ( rule__Passenger__Group__0 ) ) ;
    public final void rulePassenger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:191:2: ( ( ( rule__Passenger__Group__0 ) ) )
            // InternalBTS.g:192:2: ( ( rule__Passenger__Group__0 ) )
            {
            // InternalBTS.g:192:2: ( ( rule__Passenger__Group__0 ) )
            // InternalBTS.g:193:3: ( rule__Passenger__Group__0 )
            {
             before(grammarAccess.getPassengerAccess().getGroup()); 
            // InternalBTS.g:194:3: ( rule__Passenger__Group__0 )
            // InternalBTS.g:194:4: rule__Passenger__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Passenger__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPassengerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePassenger"


    // $ANTLR start "entryRulePayment"
    // InternalBTS.g:203:1: entryRulePayment : rulePayment EOF ;
    public final void entryRulePayment() throws RecognitionException {
        try {
            // InternalBTS.g:204:1: ( rulePayment EOF )
            // InternalBTS.g:205:1: rulePayment EOF
            {
             before(grammarAccess.getPaymentRule()); 
            pushFollow(FOLLOW_1);
            rulePayment();

            state._fsp--;

             after(grammarAccess.getPaymentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePayment"


    // $ANTLR start "rulePayment"
    // InternalBTS.g:212:1: rulePayment : ( ( rule__Payment__Group__0 ) ) ;
    public final void rulePayment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:216:2: ( ( ( rule__Payment__Group__0 ) ) )
            // InternalBTS.g:217:2: ( ( rule__Payment__Group__0 ) )
            {
            // InternalBTS.g:217:2: ( ( rule__Payment__Group__0 ) )
            // InternalBTS.g:218:3: ( rule__Payment__Group__0 )
            {
             before(grammarAccess.getPaymentAccess().getGroup()); 
            // InternalBTS.g:219:3: ( rule__Payment__Group__0 )
            // InternalBTS.g:219:4: rule__Payment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Payment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPaymentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePayment"


    // $ANTLR start "entryRuleOnlinePayment"
    // InternalBTS.g:228:1: entryRuleOnlinePayment : ruleOnlinePayment EOF ;
    public final void entryRuleOnlinePayment() throws RecognitionException {
        try {
            // InternalBTS.g:229:1: ( ruleOnlinePayment EOF )
            // InternalBTS.g:230:1: ruleOnlinePayment EOF
            {
             before(grammarAccess.getOnlinePaymentRule()); 
            pushFollow(FOLLOW_1);
            ruleOnlinePayment();

            state._fsp--;

             after(grammarAccess.getOnlinePaymentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOnlinePayment"


    // $ANTLR start "ruleOnlinePayment"
    // InternalBTS.g:237:1: ruleOnlinePayment : ( ( rule__OnlinePayment__Group__0 ) ) ;
    public final void ruleOnlinePayment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:241:2: ( ( ( rule__OnlinePayment__Group__0 ) ) )
            // InternalBTS.g:242:2: ( ( rule__OnlinePayment__Group__0 ) )
            {
            // InternalBTS.g:242:2: ( ( rule__OnlinePayment__Group__0 ) )
            // InternalBTS.g:243:3: ( rule__OnlinePayment__Group__0 )
            {
             before(grammarAccess.getOnlinePaymentAccess().getGroup()); 
            // InternalBTS.g:244:3: ( rule__OnlinePayment__Group__0 )
            // InternalBTS.g:244:4: rule__OnlinePayment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OnlinePayment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOnlinePaymentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOnlinePayment"


    // $ANTLR start "entryRuleKIOSK"
    // InternalBTS.g:253:1: entryRuleKIOSK : ruleKIOSK EOF ;
    public final void entryRuleKIOSK() throws RecognitionException {
        try {
            // InternalBTS.g:254:1: ( ruleKIOSK EOF )
            // InternalBTS.g:255:1: ruleKIOSK EOF
            {
             before(grammarAccess.getKIOSKRule()); 
            pushFollow(FOLLOW_1);
            ruleKIOSK();

            state._fsp--;

             after(grammarAccess.getKIOSKRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleKIOSK"


    // $ANTLR start "ruleKIOSK"
    // InternalBTS.g:262:1: ruleKIOSK : ( ( rule__KIOSK__Group__0 ) ) ;
    public final void ruleKIOSK() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:266:2: ( ( ( rule__KIOSK__Group__0 ) ) )
            // InternalBTS.g:267:2: ( ( rule__KIOSK__Group__0 ) )
            {
            // InternalBTS.g:267:2: ( ( rule__KIOSK__Group__0 ) )
            // InternalBTS.g:268:3: ( rule__KIOSK__Group__0 )
            {
             before(grammarAccess.getKIOSKAccess().getGroup()); 
            // InternalBTS.g:269:3: ( rule__KIOSK__Group__0 )
            // InternalBTS.g:269:4: rule__KIOSK__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__KIOSK__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKIOSKAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKIOSK"


    // $ANTLR start "entryRuleBus"
    // InternalBTS.g:278:1: entryRuleBus : ruleBus EOF ;
    public final void entryRuleBus() throws RecognitionException {
        try {
            // InternalBTS.g:279:1: ( ruleBus EOF )
            // InternalBTS.g:280:1: ruleBus EOF
            {
             before(grammarAccess.getBusRule()); 
            pushFollow(FOLLOW_1);
            ruleBus();

            state._fsp--;

             after(grammarAccess.getBusRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBus"


    // $ANTLR start "ruleBus"
    // InternalBTS.g:287:1: ruleBus : ( ( rule__Bus__Group__0 ) ) ;
    public final void ruleBus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:291:2: ( ( ( rule__Bus__Group__0 ) ) )
            // InternalBTS.g:292:2: ( ( rule__Bus__Group__0 ) )
            {
            // InternalBTS.g:292:2: ( ( rule__Bus__Group__0 ) )
            // InternalBTS.g:293:3: ( rule__Bus__Group__0 )
            {
             before(grammarAccess.getBusAccess().getGroup()); 
            // InternalBTS.g:294:3: ( rule__Bus__Group__0 )
            // InternalBTS.g:294:4: rule__Bus__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Bus__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBusAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBus"


    // $ANTLR start "entryRuleCity"
    // InternalBTS.g:303:1: entryRuleCity : ruleCity EOF ;
    public final void entryRuleCity() throws RecognitionException {
        try {
            // InternalBTS.g:304:1: ( ruleCity EOF )
            // InternalBTS.g:305:1: ruleCity EOF
            {
             before(grammarAccess.getCityRule()); 
            pushFollow(FOLLOW_1);
            ruleCity();

            state._fsp--;

             after(grammarAccess.getCityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCity"


    // $ANTLR start "ruleCity"
    // InternalBTS.g:312:1: ruleCity : ( ( rule__City__Group__0 ) ) ;
    public final void ruleCity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:316:2: ( ( ( rule__City__Group__0 ) ) )
            // InternalBTS.g:317:2: ( ( rule__City__Group__0 ) )
            {
            // InternalBTS.g:317:2: ( ( rule__City__Group__0 ) )
            // InternalBTS.g:318:3: ( rule__City__Group__0 )
            {
             before(grammarAccess.getCityAccess().getGroup()); 
            // InternalBTS.g:319:3: ( rule__City__Group__0 )
            // InternalBTS.g:319:4: rule__City__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__City__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCity"


    // $ANTLR start "entryRuleSeat"
    // InternalBTS.g:328:1: entryRuleSeat : ruleSeat EOF ;
    public final void entryRuleSeat() throws RecognitionException {
        try {
            // InternalBTS.g:329:1: ( ruleSeat EOF )
            // InternalBTS.g:330:1: ruleSeat EOF
            {
             before(grammarAccess.getSeatRule()); 
            pushFollow(FOLLOW_1);
            ruleSeat();

            state._fsp--;

             after(grammarAccess.getSeatRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSeat"


    // $ANTLR start "ruleSeat"
    // InternalBTS.g:337:1: ruleSeat : ( ( rule__Seat__Group__0 ) ) ;
    public final void ruleSeat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:341:2: ( ( ( rule__Seat__Group__0 ) ) )
            // InternalBTS.g:342:2: ( ( rule__Seat__Group__0 ) )
            {
            // InternalBTS.g:342:2: ( ( rule__Seat__Group__0 ) )
            // InternalBTS.g:343:3: ( rule__Seat__Group__0 )
            {
             before(grammarAccess.getSeatAccess().getGroup()); 
            // InternalBTS.g:344:3: ( rule__Seat__Group__0 )
            // InternalBTS.g:344:4: rule__Seat__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Seat__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSeatAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSeat"


    // $ANTLR start "rulePoint"
    // InternalBTS.g:353:1: rulePoint : ( ( rule__Point__Alternatives ) ) ;
    public final void rulePoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:357:1: ( ( ( rule__Point__Alternatives ) ) )
            // InternalBTS.g:358:2: ( ( rule__Point__Alternatives ) )
            {
            // InternalBTS.g:358:2: ( ( rule__Point__Alternatives ) )
            // InternalBTS.g:359:3: ( rule__Point__Alternatives )
            {
             before(grammarAccess.getPointAccess().getAlternatives()); 
            // InternalBTS.g:360:3: ( rule__Point__Alternatives )
            // InternalBTS.g:360:4: rule__Point__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Point__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPointAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePoint"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalBTS.g:368:1: rule__Type__Alternatives : ( ( ruleCity ) | ( ruleSeat ) | ( ruleBus ) | ( rulePassenger ) | ( ruleTicket ) | ( ruleBooking ) | ( ruleBaggage ) | ( rulePayment ) | ( ruleOnlinePayment ) | ( ruleKIOSK ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:372:1: ( ( ruleCity ) | ( ruleSeat ) | ( ruleBus ) | ( rulePassenger ) | ( ruleTicket ) | ( ruleBooking ) | ( ruleBaggage ) | ( rulePayment ) | ( ruleOnlinePayment ) | ( ruleKIOSK ) )
            int alt2=10;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt2=1;
                }
                break;
            case 25:
                {
                alt2=2;
                }
                break;
            case 23:
                {
                alt2=3;
                }
                break;
            case 16:
                {
                alt2=4;
                }
                break;
            case 15:
                {
                alt2=5;
                }
                break;
            case 14:
                {
                alt2=6;
                }
                break;
            case 13:
                {
                alt2=7;
                }
                break;
            case 17:
                {
                alt2=8;
                }
                break;
            case 18:
                {
                alt2=9;
                }
                break;
            case 22:
                {
                alt2=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalBTS.g:373:2: ( ruleCity )
                    {
                    // InternalBTS.g:373:2: ( ruleCity )
                    // InternalBTS.g:374:3: ruleCity
                    {
                     before(grammarAccess.getTypeAccess().getCityParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCity();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getCityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBTS.g:379:2: ( ruleSeat )
                    {
                    // InternalBTS.g:379:2: ( ruleSeat )
                    // InternalBTS.g:380:3: ruleSeat
                    {
                     before(grammarAccess.getTypeAccess().getSeatParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSeat();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getSeatParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBTS.g:385:2: ( ruleBus )
                    {
                    // InternalBTS.g:385:2: ( ruleBus )
                    // InternalBTS.g:386:3: ruleBus
                    {
                     before(grammarAccess.getTypeAccess().getBusParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBus();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getBusParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBTS.g:391:2: ( rulePassenger )
                    {
                    // InternalBTS.g:391:2: ( rulePassenger )
                    // InternalBTS.g:392:3: rulePassenger
                    {
                     before(grammarAccess.getTypeAccess().getPassengerParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    rulePassenger();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getPassengerParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBTS.g:397:2: ( ruleTicket )
                    {
                    // InternalBTS.g:397:2: ( ruleTicket )
                    // InternalBTS.g:398:3: ruleTicket
                    {
                     before(grammarAccess.getTypeAccess().getTicketParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleTicket();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getTicketParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalBTS.g:403:2: ( ruleBooking )
                    {
                    // InternalBTS.g:403:2: ( ruleBooking )
                    // InternalBTS.g:404:3: ruleBooking
                    {
                     before(grammarAccess.getTypeAccess().getBookingParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleBooking();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getBookingParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalBTS.g:409:2: ( ruleBaggage )
                    {
                    // InternalBTS.g:409:2: ( ruleBaggage )
                    // InternalBTS.g:410:3: ruleBaggage
                    {
                     before(grammarAccess.getTypeAccess().getBaggageParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleBaggage();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getBaggageParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalBTS.g:415:2: ( rulePayment )
                    {
                    // InternalBTS.g:415:2: ( rulePayment )
                    // InternalBTS.g:416:3: rulePayment
                    {
                     before(grammarAccess.getTypeAccess().getPaymentParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    rulePayment();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getPaymentParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalBTS.g:421:2: ( ruleOnlinePayment )
                    {
                    // InternalBTS.g:421:2: ( ruleOnlinePayment )
                    // InternalBTS.g:422:3: ruleOnlinePayment
                    {
                     before(grammarAccess.getTypeAccess().getOnlinePaymentParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleOnlinePayment();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getOnlinePaymentParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalBTS.g:427:2: ( ruleKIOSK )
                    {
                    // InternalBTS.g:427:2: ( ruleKIOSK )
                    // InternalBTS.g:428:3: ruleKIOSK
                    {
                     before(grammarAccess.getTypeAccess().getKIOSKParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleKIOSK();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getKIOSKParserRuleCall_9()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Point__Alternatives"
    // InternalBTS.g:437:1: rule__Point__Alternatives : ( ( ( 'ARRIVAL_POINT' ) ) | ( ( 'DEPARTURE_POINT' ) ) );
    public final void rule__Point__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:441:1: ( ( ( 'ARRIVAL_POINT' ) ) | ( ( 'DEPARTURE_POINT' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalBTS.g:442:2: ( ( 'ARRIVAL_POINT' ) )
                    {
                    // InternalBTS.g:442:2: ( ( 'ARRIVAL_POINT' ) )
                    // InternalBTS.g:443:3: ( 'ARRIVAL_POINT' )
                    {
                     before(grammarAccess.getPointAccess().getARRIVAL_POINTEnumLiteralDeclaration_0()); 
                    // InternalBTS.g:444:3: ( 'ARRIVAL_POINT' )
                    // InternalBTS.g:444:4: 'ARRIVAL_POINT'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getPointAccess().getARRIVAL_POINTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBTS.g:448:2: ( ( 'DEPARTURE_POINT' ) )
                    {
                    // InternalBTS.g:448:2: ( ( 'DEPARTURE_POINT' ) )
                    // InternalBTS.g:449:3: ( 'DEPARTURE_POINT' )
                    {
                     before(grammarAccess.getPointAccess().getDEPARTURE_POINTEnumLiteralDeclaration_1()); 
                    // InternalBTS.g:450:3: ( 'DEPARTURE_POINT' )
                    // InternalBTS.g:450:4: 'DEPARTURE_POINT'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getPointAccess().getDEPARTURE_POINTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Alternatives"


    // $ANTLR start "rule__Baggage__Group__0"
    // InternalBTS.g:458:1: rule__Baggage__Group__0 : rule__Baggage__Group__0__Impl rule__Baggage__Group__1 ;
    public final void rule__Baggage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:462:1: ( rule__Baggage__Group__0__Impl rule__Baggage__Group__1 )
            // InternalBTS.g:463:2: rule__Baggage__Group__0__Impl rule__Baggage__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Baggage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Baggage__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Baggage__Group__0"


    // $ANTLR start "rule__Baggage__Group__0__Impl"
    // InternalBTS.g:470:1: rule__Baggage__Group__0__Impl : ( 'Baggage' ) ;
    public final void rule__Baggage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:474:1: ( ( 'Baggage' ) )
            // InternalBTS.g:475:1: ( 'Baggage' )
            {
            // InternalBTS.g:475:1: ( 'Baggage' )
            // InternalBTS.g:476:2: 'Baggage'
            {
             before(grammarAccess.getBaggageAccess().getBaggageKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getBaggageAccess().getBaggageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Baggage__Group__0__Impl"


    // $ANTLR start "rule__Baggage__Group__1"
    // InternalBTS.g:485:1: rule__Baggage__Group__1 : rule__Baggage__Group__1__Impl ;
    public final void rule__Baggage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:489:1: ( rule__Baggage__Group__1__Impl )
            // InternalBTS.g:490:2: rule__Baggage__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Baggage__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Baggage__Group__1"


    // $ANTLR start "rule__Baggage__Group__1__Impl"
    // InternalBTS.g:496:1: rule__Baggage__Group__1__Impl : ( ( rule__Baggage__NameAssignment_1 ) ) ;
    public final void rule__Baggage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:500:1: ( ( ( rule__Baggage__NameAssignment_1 ) ) )
            // InternalBTS.g:501:1: ( ( rule__Baggage__NameAssignment_1 ) )
            {
            // InternalBTS.g:501:1: ( ( rule__Baggage__NameAssignment_1 ) )
            // InternalBTS.g:502:2: ( rule__Baggage__NameAssignment_1 )
            {
             before(grammarAccess.getBaggageAccess().getNameAssignment_1()); 
            // InternalBTS.g:503:2: ( rule__Baggage__NameAssignment_1 )
            // InternalBTS.g:503:3: rule__Baggage__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Baggage__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBaggageAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Baggage__Group__1__Impl"


    // $ANTLR start "rule__Booking__Group__0"
    // InternalBTS.g:512:1: rule__Booking__Group__0 : rule__Booking__Group__0__Impl rule__Booking__Group__1 ;
    public final void rule__Booking__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:516:1: ( rule__Booking__Group__0__Impl rule__Booking__Group__1 )
            // InternalBTS.g:517:2: rule__Booking__Group__0__Impl rule__Booking__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Booking__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Booking__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Booking__Group__0"


    // $ANTLR start "rule__Booking__Group__0__Impl"
    // InternalBTS.g:524:1: rule__Booking__Group__0__Impl : ( 'Booking' ) ;
    public final void rule__Booking__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:528:1: ( ( 'Booking' ) )
            // InternalBTS.g:529:1: ( 'Booking' )
            {
            // InternalBTS.g:529:1: ( 'Booking' )
            // InternalBTS.g:530:2: 'Booking'
            {
             before(grammarAccess.getBookingAccess().getBookingKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getBookingAccess().getBookingKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Booking__Group__0__Impl"


    // $ANTLR start "rule__Booking__Group__1"
    // InternalBTS.g:539:1: rule__Booking__Group__1 : rule__Booking__Group__1__Impl ;
    public final void rule__Booking__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:543:1: ( rule__Booking__Group__1__Impl )
            // InternalBTS.g:544:2: rule__Booking__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Booking__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Booking__Group__1"


    // $ANTLR start "rule__Booking__Group__1__Impl"
    // InternalBTS.g:550:1: rule__Booking__Group__1__Impl : ( ( rule__Booking__NameAssignment_1 ) ) ;
    public final void rule__Booking__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:554:1: ( ( ( rule__Booking__NameAssignment_1 ) ) )
            // InternalBTS.g:555:1: ( ( rule__Booking__NameAssignment_1 ) )
            {
            // InternalBTS.g:555:1: ( ( rule__Booking__NameAssignment_1 ) )
            // InternalBTS.g:556:2: ( rule__Booking__NameAssignment_1 )
            {
             before(grammarAccess.getBookingAccess().getNameAssignment_1()); 
            // InternalBTS.g:557:2: ( rule__Booking__NameAssignment_1 )
            // InternalBTS.g:557:3: rule__Booking__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Booking__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBookingAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Booking__Group__1__Impl"


    // $ANTLR start "rule__Ticket__Group__0"
    // InternalBTS.g:566:1: rule__Ticket__Group__0 : rule__Ticket__Group__0__Impl rule__Ticket__Group__1 ;
    public final void rule__Ticket__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:570:1: ( rule__Ticket__Group__0__Impl rule__Ticket__Group__1 )
            // InternalBTS.g:571:2: rule__Ticket__Group__0__Impl rule__Ticket__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Ticket__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ticket__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ticket__Group__0"


    // $ANTLR start "rule__Ticket__Group__0__Impl"
    // InternalBTS.g:578:1: rule__Ticket__Group__0__Impl : ( 'Ticket' ) ;
    public final void rule__Ticket__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:582:1: ( ( 'Ticket' ) )
            // InternalBTS.g:583:1: ( 'Ticket' )
            {
            // InternalBTS.g:583:1: ( 'Ticket' )
            // InternalBTS.g:584:2: 'Ticket'
            {
             before(grammarAccess.getTicketAccess().getTicketKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTicketAccess().getTicketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ticket__Group__0__Impl"


    // $ANTLR start "rule__Ticket__Group__1"
    // InternalBTS.g:593:1: rule__Ticket__Group__1 : rule__Ticket__Group__1__Impl ;
    public final void rule__Ticket__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:597:1: ( rule__Ticket__Group__1__Impl )
            // InternalBTS.g:598:2: rule__Ticket__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ticket__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ticket__Group__1"


    // $ANTLR start "rule__Ticket__Group__1__Impl"
    // InternalBTS.g:604:1: rule__Ticket__Group__1__Impl : ( ( rule__Ticket__NameAssignment_1 ) ) ;
    public final void rule__Ticket__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:608:1: ( ( ( rule__Ticket__NameAssignment_1 ) ) )
            // InternalBTS.g:609:1: ( ( rule__Ticket__NameAssignment_1 ) )
            {
            // InternalBTS.g:609:1: ( ( rule__Ticket__NameAssignment_1 ) )
            // InternalBTS.g:610:2: ( rule__Ticket__NameAssignment_1 )
            {
             before(grammarAccess.getTicketAccess().getNameAssignment_1()); 
            // InternalBTS.g:611:2: ( rule__Ticket__NameAssignment_1 )
            // InternalBTS.g:611:3: rule__Ticket__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Ticket__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTicketAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ticket__Group__1__Impl"


    // $ANTLR start "rule__Passenger__Group__0"
    // InternalBTS.g:620:1: rule__Passenger__Group__0 : rule__Passenger__Group__0__Impl rule__Passenger__Group__1 ;
    public final void rule__Passenger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:624:1: ( rule__Passenger__Group__0__Impl rule__Passenger__Group__1 )
            // InternalBTS.g:625:2: rule__Passenger__Group__0__Impl rule__Passenger__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Passenger__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Passenger__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passenger__Group__0"


    // $ANTLR start "rule__Passenger__Group__0__Impl"
    // InternalBTS.g:632:1: rule__Passenger__Group__0__Impl : ( 'Passenger' ) ;
    public final void rule__Passenger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:636:1: ( ( 'Passenger' ) )
            // InternalBTS.g:637:1: ( 'Passenger' )
            {
            // InternalBTS.g:637:1: ( 'Passenger' )
            // InternalBTS.g:638:2: 'Passenger'
            {
             before(grammarAccess.getPassengerAccess().getPassengerKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPassengerAccess().getPassengerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passenger__Group__0__Impl"


    // $ANTLR start "rule__Passenger__Group__1"
    // InternalBTS.g:647:1: rule__Passenger__Group__1 : rule__Passenger__Group__1__Impl ;
    public final void rule__Passenger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:651:1: ( rule__Passenger__Group__1__Impl )
            // InternalBTS.g:652:2: rule__Passenger__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Passenger__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passenger__Group__1"


    // $ANTLR start "rule__Passenger__Group__1__Impl"
    // InternalBTS.g:658:1: rule__Passenger__Group__1__Impl : ( ( rule__Passenger__NameAssignment_1 ) ) ;
    public final void rule__Passenger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:662:1: ( ( ( rule__Passenger__NameAssignment_1 ) ) )
            // InternalBTS.g:663:1: ( ( rule__Passenger__NameAssignment_1 ) )
            {
            // InternalBTS.g:663:1: ( ( rule__Passenger__NameAssignment_1 ) )
            // InternalBTS.g:664:2: ( rule__Passenger__NameAssignment_1 )
            {
             before(grammarAccess.getPassengerAccess().getNameAssignment_1()); 
            // InternalBTS.g:665:2: ( rule__Passenger__NameAssignment_1 )
            // InternalBTS.g:665:3: rule__Passenger__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Passenger__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPassengerAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passenger__Group__1__Impl"


    // $ANTLR start "rule__Payment__Group__0"
    // InternalBTS.g:674:1: rule__Payment__Group__0 : rule__Payment__Group__0__Impl rule__Payment__Group__1 ;
    public final void rule__Payment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:678:1: ( rule__Payment__Group__0__Impl rule__Payment__Group__1 )
            // InternalBTS.g:679:2: rule__Payment__Group__0__Impl rule__Payment__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Payment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Payment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Payment__Group__0"


    // $ANTLR start "rule__Payment__Group__0__Impl"
    // InternalBTS.g:686:1: rule__Payment__Group__0__Impl : ( 'Payment' ) ;
    public final void rule__Payment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:690:1: ( ( 'Payment' ) )
            // InternalBTS.g:691:1: ( 'Payment' )
            {
            // InternalBTS.g:691:1: ( 'Payment' )
            // InternalBTS.g:692:2: 'Payment'
            {
             before(grammarAccess.getPaymentAccess().getPaymentKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPaymentAccess().getPaymentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Payment__Group__0__Impl"


    // $ANTLR start "rule__Payment__Group__1"
    // InternalBTS.g:701:1: rule__Payment__Group__1 : rule__Payment__Group__1__Impl ;
    public final void rule__Payment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:705:1: ( rule__Payment__Group__1__Impl )
            // InternalBTS.g:706:2: rule__Payment__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Payment__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Payment__Group__1"


    // $ANTLR start "rule__Payment__Group__1__Impl"
    // InternalBTS.g:712:1: rule__Payment__Group__1__Impl : ( ( rule__Payment__NameAssignment_1 ) ) ;
    public final void rule__Payment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:716:1: ( ( ( rule__Payment__NameAssignment_1 ) ) )
            // InternalBTS.g:717:1: ( ( rule__Payment__NameAssignment_1 ) )
            {
            // InternalBTS.g:717:1: ( ( rule__Payment__NameAssignment_1 ) )
            // InternalBTS.g:718:2: ( rule__Payment__NameAssignment_1 )
            {
             before(grammarAccess.getPaymentAccess().getNameAssignment_1()); 
            // InternalBTS.g:719:2: ( rule__Payment__NameAssignment_1 )
            // InternalBTS.g:719:3: rule__Payment__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Payment__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPaymentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Payment__Group__1__Impl"


    // $ANTLR start "rule__OnlinePayment__Group__0"
    // InternalBTS.g:728:1: rule__OnlinePayment__Group__0 : rule__OnlinePayment__Group__0__Impl rule__OnlinePayment__Group__1 ;
    public final void rule__OnlinePayment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:732:1: ( rule__OnlinePayment__Group__0__Impl rule__OnlinePayment__Group__1 )
            // InternalBTS.g:733:2: rule__OnlinePayment__Group__0__Impl rule__OnlinePayment__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__OnlinePayment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OnlinePayment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnlinePayment__Group__0"


    // $ANTLR start "rule__OnlinePayment__Group__0__Impl"
    // InternalBTS.g:740:1: rule__OnlinePayment__Group__0__Impl : ( 'OnlinePayment' ) ;
    public final void rule__OnlinePayment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:744:1: ( ( 'OnlinePayment' ) )
            // InternalBTS.g:745:1: ( 'OnlinePayment' )
            {
            // InternalBTS.g:745:1: ( 'OnlinePayment' )
            // InternalBTS.g:746:2: 'OnlinePayment'
            {
             before(grammarAccess.getOnlinePaymentAccess().getOnlinePaymentKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getOnlinePaymentAccess().getOnlinePaymentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnlinePayment__Group__0__Impl"


    // $ANTLR start "rule__OnlinePayment__Group__1"
    // InternalBTS.g:755:1: rule__OnlinePayment__Group__1 : rule__OnlinePayment__Group__1__Impl rule__OnlinePayment__Group__2 ;
    public final void rule__OnlinePayment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:759:1: ( rule__OnlinePayment__Group__1__Impl rule__OnlinePayment__Group__2 )
            // InternalBTS.g:760:2: rule__OnlinePayment__Group__1__Impl rule__OnlinePayment__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__OnlinePayment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OnlinePayment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnlinePayment__Group__1"


    // $ANTLR start "rule__OnlinePayment__Group__1__Impl"
    // InternalBTS.g:767:1: rule__OnlinePayment__Group__1__Impl : ( ( rule__OnlinePayment__NameAssignment_1 ) ) ;
    public final void rule__OnlinePayment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:771:1: ( ( ( rule__OnlinePayment__NameAssignment_1 ) ) )
            // InternalBTS.g:772:1: ( ( rule__OnlinePayment__NameAssignment_1 ) )
            {
            // InternalBTS.g:772:1: ( ( rule__OnlinePayment__NameAssignment_1 ) )
            // InternalBTS.g:773:2: ( rule__OnlinePayment__NameAssignment_1 )
            {
             before(grammarAccess.getOnlinePaymentAccess().getNameAssignment_1()); 
            // InternalBTS.g:774:2: ( rule__OnlinePayment__NameAssignment_1 )
            // InternalBTS.g:774:3: rule__OnlinePayment__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OnlinePayment__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOnlinePaymentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnlinePayment__Group__1__Impl"


    // $ANTLR start "rule__OnlinePayment__Group__2"
    // InternalBTS.g:782:1: rule__OnlinePayment__Group__2 : rule__OnlinePayment__Group__2__Impl rule__OnlinePayment__Group__3 ;
    public final void rule__OnlinePayment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:786:1: ( rule__OnlinePayment__Group__2__Impl rule__OnlinePayment__Group__3 )
            // InternalBTS.g:787:2: rule__OnlinePayment__Group__2__Impl rule__OnlinePayment__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__OnlinePayment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OnlinePayment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnlinePayment__Group__2"


    // $ANTLR start "rule__OnlinePayment__Group__2__Impl"
    // InternalBTS.g:794:1: rule__OnlinePayment__Group__2__Impl : ( ( rule__OnlinePayment__Group_2__0 ) ) ;
    public final void rule__OnlinePayment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:798:1: ( ( ( rule__OnlinePayment__Group_2__0 ) ) )
            // InternalBTS.g:799:1: ( ( rule__OnlinePayment__Group_2__0 ) )
            {
            // InternalBTS.g:799:1: ( ( rule__OnlinePayment__Group_2__0 ) )
            // InternalBTS.g:800:2: ( rule__OnlinePayment__Group_2__0 )
            {
             before(grammarAccess.getOnlinePaymentAccess().getGroup_2()); 
            // InternalBTS.g:801:2: ( rule__OnlinePayment__Group_2__0 )
            // InternalBTS.g:801:3: rule__OnlinePayment__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__OnlinePayment__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getOnlinePaymentAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnlinePayment__Group__2__Impl"


    // $ANTLR start "rule__OnlinePayment__Group__3"
    // InternalBTS.g:809:1: rule__OnlinePayment__Group__3 : rule__OnlinePayment__Group__3__Impl rule__OnlinePayment__Group__4 ;
    public final void rule__OnlinePayment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:813:1: ( rule__OnlinePayment__Group__3__Impl rule__OnlinePayment__Group__4 )
            // InternalBTS.g:814:2: rule__OnlinePayment__Group__3__Impl rule__OnlinePayment__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__OnlinePayment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OnlinePayment__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnlinePayment__Group__3"


    // $ANTLR start "rule__OnlinePayment__Group__3__Impl"
    // InternalBTS.g:821:1: rule__OnlinePayment__Group__3__Impl : ( '{' ) ;
    public final void rule__OnlinePayment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:825:1: ( ( '{' ) )
            // InternalBTS.g:826:1: ( '{' )
            {
            // InternalBTS.g:826:1: ( '{' )
            // InternalBTS.g:827:2: '{'
            {
             before(grammarAccess.getOnlinePaymentAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getOnlinePaymentAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnlinePayment__Group__3__Impl"


    // $ANTLR start "rule__OnlinePayment__Group__4"
    // InternalBTS.g:836:1: rule__OnlinePayment__Group__4 : rule__OnlinePayment__Group__4__Impl ;
    public final void rule__OnlinePayment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:840:1: ( rule__OnlinePayment__Group__4__Impl )
            // InternalBTS.g:841:2: rule__OnlinePayment__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OnlinePayment__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnlinePayment__Group__4"


    // $ANTLR start "rule__OnlinePayment__Group__4__Impl"
    // InternalBTS.g:847:1: rule__OnlinePayment__Group__4__Impl : ( '}' ) ;
    public final void rule__OnlinePayment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:851:1: ( ( '}' ) )
            // InternalBTS.g:852:1: ( '}' )
            {
            // InternalBTS.g:852:1: ( '}' )
            // InternalBTS.g:853:2: '}'
            {
             before(grammarAccess.getOnlinePaymentAccess().getRightCurlyBracketKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getOnlinePaymentAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnlinePayment__Group__4__Impl"


    // $ANTLR start "rule__OnlinePayment__Group_2__0"
    // InternalBTS.g:863:1: rule__OnlinePayment__Group_2__0 : rule__OnlinePayment__Group_2__0__Impl rule__OnlinePayment__Group_2__1 ;
    public final void rule__OnlinePayment__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:867:1: ( rule__OnlinePayment__Group_2__0__Impl rule__OnlinePayment__Group_2__1 )
            // InternalBTS.g:868:2: rule__OnlinePayment__Group_2__0__Impl rule__OnlinePayment__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__OnlinePayment__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OnlinePayment__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnlinePayment__Group_2__0"


    // $ANTLR start "rule__OnlinePayment__Group_2__0__Impl"
    // InternalBTS.g:875:1: rule__OnlinePayment__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__OnlinePayment__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:879:1: ( ( 'extends' ) )
            // InternalBTS.g:880:1: ( 'extends' )
            {
            // InternalBTS.g:880:1: ( 'extends' )
            // InternalBTS.g:881:2: 'extends'
            {
             before(grammarAccess.getOnlinePaymentAccess().getExtendsKeyword_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getOnlinePaymentAccess().getExtendsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnlinePayment__Group_2__0__Impl"


    // $ANTLR start "rule__OnlinePayment__Group_2__1"
    // InternalBTS.g:890:1: rule__OnlinePayment__Group_2__1 : rule__OnlinePayment__Group_2__1__Impl ;
    public final void rule__OnlinePayment__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:894:1: ( rule__OnlinePayment__Group_2__1__Impl )
            // InternalBTS.g:895:2: rule__OnlinePayment__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OnlinePayment__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnlinePayment__Group_2__1"


    // $ANTLR start "rule__OnlinePayment__Group_2__1__Impl"
    // InternalBTS.g:901:1: rule__OnlinePayment__Group_2__1__Impl : ( ( rule__OnlinePayment__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__OnlinePayment__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:905:1: ( ( ( rule__OnlinePayment__SuperTypeAssignment_2_1 ) ) )
            // InternalBTS.g:906:1: ( ( rule__OnlinePayment__SuperTypeAssignment_2_1 ) )
            {
            // InternalBTS.g:906:1: ( ( rule__OnlinePayment__SuperTypeAssignment_2_1 ) )
            // InternalBTS.g:907:2: ( rule__OnlinePayment__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getOnlinePaymentAccess().getSuperTypeAssignment_2_1()); 
            // InternalBTS.g:908:2: ( rule__OnlinePayment__SuperTypeAssignment_2_1 )
            // InternalBTS.g:908:3: rule__OnlinePayment__SuperTypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__OnlinePayment__SuperTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getOnlinePaymentAccess().getSuperTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnlinePayment__Group_2__1__Impl"


    // $ANTLR start "rule__KIOSK__Group__0"
    // InternalBTS.g:917:1: rule__KIOSK__Group__0 : rule__KIOSK__Group__0__Impl rule__KIOSK__Group__1 ;
    public final void rule__KIOSK__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:921:1: ( rule__KIOSK__Group__0__Impl rule__KIOSK__Group__1 )
            // InternalBTS.g:922:2: rule__KIOSK__Group__0__Impl rule__KIOSK__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__KIOSK__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KIOSK__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KIOSK__Group__0"


    // $ANTLR start "rule__KIOSK__Group__0__Impl"
    // InternalBTS.g:929:1: rule__KIOSK__Group__0__Impl : ( 'KIOSK' ) ;
    public final void rule__KIOSK__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:933:1: ( ( 'KIOSK' ) )
            // InternalBTS.g:934:1: ( 'KIOSK' )
            {
            // InternalBTS.g:934:1: ( 'KIOSK' )
            // InternalBTS.g:935:2: 'KIOSK'
            {
             before(grammarAccess.getKIOSKAccess().getKIOSKKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getKIOSKAccess().getKIOSKKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KIOSK__Group__0__Impl"


    // $ANTLR start "rule__KIOSK__Group__1"
    // InternalBTS.g:944:1: rule__KIOSK__Group__1 : rule__KIOSK__Group__1__Impl rule__KIOSK__Group__2 ;
    public final void rule__KIOSK__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:948:1: ( rule__KIOSK__Group__1__Impl rule__KIOSK__Group__2 )
            // InternalBTS.g:949:2: rule__KIOSK__Group__1__Impl rule__KIOSK__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__KIOSK__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KIOSK__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KIOSK__Group__1"


    // $ANTLR start "rule__KIOSK__Group__1__Impl"
    // InternalBTS.g:956:1: rule__KIOSK__Group__1__Impl : ( ( rule__KIOSK__NameAssignment_1 ) ) ;
    public final void rule__KIOSK__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:960:1: ( ( ( rule__KIOSK__NameAssignment_1 ) ) )
            // InternalBTS.g:961:1: ( ( rule__KIOSK__NameAssignment_1 ) )
            {
            // InternalBTS.g:961:1: ( ( rule__KIOSK__NameAssignment_1 ) )
            // InternalBTS.g:962:2: ( rule__KIOSK__NameAssignment_1 )
            {
             before(grammarAccess.getKIOSKAccess().getNameAssignment_1()); 
            // InternalBTS.g:963:2: ( rule__KIOSK__NameAssignment_1 )
            // InternalBTS.g:963:3: rule__KIOSK__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__KIOSK__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getKIOSKAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KIOSK__Group__1__Impl"


    // $ANTLR start "rule__KIOSK__Group__2"
    // InternalBTS.g:971:1: rule__KIOSK__Group__2 : rule__KIOSK__Group__2__Impl rule__KIOSK__Group__3 ;
    public final void rule__KIOSK__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:975:1: ( rule__KIOSK__Group__2__Impl rule__KIOSK__Group__3 )
            // InternalBTS.g:976:2: rule__KIOSK__Group__2__Impl rule__KIOSK__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__KIOSK__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KIOSK__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KIOSK__Group__2"


    // $ANTLR start "rule__KIOSK__Group__2__Impl"
    // InternalBTS.g:983:1: rule__KIOSK__Group__2__Impl : ( ( rule__KIOSK__Group_2__0 ) ) ;
    public final void rule__KIOSK__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:987:1: ( ( ( rule__KIOSK__Group_2__0 ) ) )
            // InternalBTS.g:988:1: ( ( rule__KIOSK__Group_2__0 ) )
            {
            // InternalBTS.g:988:1: ( ( rule__KIOSK__Group_2__0 ) )
            // InternalBTS.g:989:2: ( rule__KIOSK__Group_2__0 )
            {
             before(grammarAccess.getKIOSKAccess().getGroup_2()); 
            // InternalBTS.g:990:2: ( rule__KIOSK__Group_2__0 )
            // InternalBTS.g:990:3: rule__KIOSK__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__KIOSK__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getKIOSKAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KIOSK__Group__2__Impl"


    // $ANTLR start "rule__KIOSK__Group__3"
    // InternalBTS.g:998:1: rule__KIOSK__Group__3 : rule__KIOSK__Group__3__Impl rule__KIOSK__Group__4 ;
    public final void rule__KIOSK__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:1002:1: ( rule__KIOSK__Group__3__Impl rule__KIOSK__Group__4 )
            // InternalBTS.g:1003:2: rule__KIOSK__Group__3__Impl rule__KIOSK__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__KIOSK__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KIOSK__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KIOSK__Group__3"


    // $ANTLR start "rule__KIOSK__Group__3__Impl"
    // InternalBTS.g:1010:1: rule__KIOSK__Group__3__Impl : ( '{' ) ;
    public final void rule__KIOSK__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:1014:1: ( ( '{' ) )
            // InternalBTS.g:1015:1: ( '{' )
            {
            // InternalBTS.g:1015:1: ( '{' )
            // InternalBTS.g:1016:2: '{'
            {
             before(grammarAccess.getKIOSKAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getKIOSKAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KIOSK__Group__3__Impl"


    // $ANTLR start "rule__KIOSK__Group__4"
    // InternalBTS.g:1025:1: rule__KIOSK__Group__4 : rule__KIOSK__Group__4__Impl ;
    public final void rule__KIOSK__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:1029:1: ( rule__KIOSK__Group__4__Impl )
            // InternalBTS.g:1030:2: rule__KIOSK__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KIOSK__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KIOSK__Group__4"


    // $ANTLR start "rule__KIOSK__Group__4__Impl"
    // InternalBTS.g:1036:1: rule__KIOSK__Group__4__Impl : ( '}' ) ;
    public final void rule__KIOSK__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:1040:1: ( ( '}' ) )
            // InternalBTS.g:1041:1: ( '}' )
            {
            // InternalBTS.g:1041:1: ( '}' )
            // InternalBTS.g:1042:2: '}'
            {
             before(grammarAccess.getKIOSKAccess().getRightCurlyBracketKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getKIOSKAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KIOSK__Group__4__Impl"


    // $ANTLR start "rule__KIOSK__Group_2__0"
    // InternalBTS.g:1052:1: rule__KIOSK__Group_2__0 : rule__KIOSK__Group_2__0__Impl rule__KIOSK__Group_2__1 ;
    public final void rule__KIOSK__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:1056:1: ( rule__KIOSK__Group_2__0__Impl rule__KIOSK__Group_2__1 )
            // InternalBTS.g:1057:2: rule__KIOSK__Group_2__0__Impl rule__KIOSK__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__KIOSK__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KIOSK__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KIOSK__Group_2__0"


    // $ANTLR start "rule__KIOSK__Group_2__0__Impl"
    // InternalBTS.g:1064:1: rule__KIOSK__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__KIOSK__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:1068:1: ( ( 'extends' ) )
            // InternalBTS.g:1069:1: ( 'extends' )
            {
            // InternalBTS.g:1069:1: ( 'extends' )
            // InternalBTS.g:1070:2: 'extends'
            {
             before(grammarAccess.getKIOSKAccess().getExtendsKeyword_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getKIOSKAccess().getExtendsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KIOSK__Group_2__0__Impl"


    // $ANTLR start "rule__KIOSK__Group_2__1"
    // InternalBTS.g:1079:1: rule__KIOSK__Group_2__1 : rule__KIOSK__Group_2__1__Impl ;
    public final void rule__KIOSK__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:1083:1: ( rule__KIOSK__Group_2__1__Impl )
            // InternalBTS.g:1084:2: rule__KIOSK__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KIOSK__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KIOSK__Group_2__1"


    // $ANTLR start "rule__KIOSK__Group_2__1__Impl"
    // InternalBTS.g:1090:1: rule__KIOSK__Group_2__1__Impl : ( ( rule__KIOSK__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__KIOSK__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:1094:1: ( ( ( rule__KIOSK__SuperTypeAssignment_2_1 ) ) )
            // InternalBTS.g:1095:1: ( ( rule__KIOSK__SuperTypeAssignment_2_1 ) )
            {
            // InternalBTS.g:1095:1: ( ( rule__KIOSK__SuperTypeAssignment_2_1 ) )
            // InternalBTS.g:1096:2: ( rule__KIOSK__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getKIOSKAccess().getSuperTypeAssignment_2_1()); 
            // InternalBTS.g:1097:2: ( rule__KIOSK__SuperTypeAssignment_2_1 )
            // InternalBTS.g:1097:3: rule__KIOSK__SuperTypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__KIOSK__SuperTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getKIOSKAccess().getSuperTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KIOSK__Group_2__1__Impl"


    // $ANTLR start "rule__Bus__Group__0"
    // InternalBTS.g:1106:1: rule__Bus__Group__0 : rule__Bus__Group__0__Impl rule__Bus__Group__1 ;
    public final void rule__Bus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:1110:1: ( rule__Bus__Group__0__Impl rule__Bus__Group__1 )
            // InternalBTS.g:1111:2: rule__Bus__Group__0__Impl rule__Bus__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Bus__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bus__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bus__Group__0"


    // $ANTLR start "rule__Bus__Group__0__Impl"
    // InternalBTS.g:1118:1: rule__Bus__Group__0__Impl : ( 'Bus' ) ;
    public final void rule__Bus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:1122:1: ( ( 'Bus' ) )
            // InternalBTS.g:1123:1: ( 'Bus' )
            {
            // InternalBTS.g:1123:1: ( 'Bus' )
            // InternalBTS.g:1124:2: 'Bus'
            {
             before(grammarAccess.getBusAccess().getBusKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getBusAccess().getBusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bus__Group__0__Impl"


    // $ANTLR start "rule__Bus__Group__1"
    // InternalBTS.g:1133:1: rule__Bus__Group__1 : rule__Bus__Group__1__Impl rule__Bus__Group__2 ;
    public final void rule__Bus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:1137:1: ( rule__Bus__Group__1__Impl rule__Bus__Group__2 )
            // InternalBTS.g:1138:2: rule__Bus__Group__1__Impl rule__Bus__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Bus__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bus__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bus__Group__1"


    // $ANTLR start "rule__Bus__Group__1__Impl"
    // InternalBTS.g:1145:1: rule__Bus__Group__1__Impl : ( ( rule__Bus__NameAssignment_1 ) ) ;
    public final void rule__Bus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:1149:1: ( ( ( rule__Bus__NameAssignment_1 ) ) )
            // InternalBTS.g:1150:1: ( ( rule__Bus__NameAssignment_1 ) )
            {
            // InternalBTS.g:1150:1: ( ( rule__Bus__NameAssignment_1 ) )
            // InternalBTS.g:1151:2: ( rule__Bus__NameAssignment_1 )
            {
             before(grammarAccess.getBusAccess().getNameAssignment_1()); 
            // InternalBTS.g:1152:2: ( rule__Bus__NameAssignment_1 )
            // InternalBTS.g:1152:3: rule__Bus__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Bus__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBusAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bus__Group__1__Impl"


    // $ANTLR start "rule__Bus__Group__2"
    // InternalBTS.g:1160:1: rule__Bus__Group__2 : rule__Bus__Group__2__Impl rule__Bus__Group__3 ;
    public final void rule__Bus__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:1164:1: ( rule__Bus__Group__2__Impl rule__Bus__Group__3 )
            // InternalBTS.g:1165:2: rule__Bus__Group__2__Impl rule__Bus__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Bus__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bus__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bus__Group__2"


    // $ANTLR start "rule__Bus__Group__2__Impl"
    // InternalBTS.g:1172:1: rule__Bus__Group__2__Impl : ( '{' ) ;
    public final void rule__Bus__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:1176:1: ( ( '{' ) )
            // InternalBTS.g:1177:1: ( '{' )
            {
            // InternalBTS.g:1177:1: ( '{' )
            // InternalBTS.g:1178:2: '{'
            {
             before(grammarAccess.getBusAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBusAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bus__Group__2__Impl"


    // $ANTLR start "rule__Bus__Group__3"
    // InternalBTS.g:1187:1: rule__Bus__Group__3 : rule__Bus__Group__3__Impl ;
    public final void rule__Bus__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:1191:1: ( rule__Bus__Group__3__Impl )
            // InternalBTS.g:1192:2: rule__Bus__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Bus__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bus__Group__3"


    // $ANTLR start "rule__Bus__Group__3__Impl"
    // InternalBTS.g:1198:1: rule__Bus__Group__3__Impl : ( '}' ) ;
    public final void rule__Bus__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:1202:1: ( ( '}' ) )
            // InternalBTS.g:1203:1: ( '}' )
            {
            // InternalBTS.g:1203:1: ( '}' )
            // InternalBTS.g:1204:2: '}'
            {
             before(grammarAccess.getBusAccess().getRightCurlyBracketKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getBusAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bus__Group__3__Impl"


    // $ANTLR start "rule__City__Group__0"
    // InternalBTS.g:1214:1: rule__City__Group__0 : rule__City__Group__0__Impl rule__City__Group__1 ;
    public final void rule__City__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:1218:1: ( rule__City__Group__0__Impl rule__City__Group__1 )
            // InternalBTS.g:1219:2: rule__City__Group__0__Impl rule__City__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__City__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__City__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group__0"


    // $ANTLR start "rule__City__Group__0__Impl"
    // InternalBTS.g:1226:1: rule__City__Group__0__Impl : ( 'City' ) ;
    public final void rule__City__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:1230:1: ( ( 'City' ) )
            // InternalBTS.g:1231:1: ( 'City' )
            {
            // InternalBTS.g:1231:1: ( 'City' )
            // InternalBTS.g:1232:2: 'City'
            {
             before(grammarAccess.getCityAccess().getCityKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCityAccess().getCityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group__0__Impl"


    // $ANTLR start "rule__City__Group__1"
    // InternalBTS.g:1241:1: rule__City__Group__1 : rule__City__Group__1__Impl rule__City__Group__2 ;
    public final void rule__City__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:1245:1: ( rule__City__Group__1__Impl rule__City__Group__2 )
            // InternalBTS.g:1246:2: rule__City__Group__1__Impl rule__City__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__City__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__City__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group__1"


    // $ANTLR start "rule__City__Group__1__Impl"
    // InternalBTS.g:1253:1: rule__City__Group__1__Impl : ( ( rule__City__NameAssignment_1 ) ) ;
    public final void rule__City__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:1257:1: ( ( ( rule__City__NameAssignment_1 ) ) )
            // InternalBTS.g:1258:1: ( ( rule__City__NameAssignment_1 ) )
            {
            // InternalBTS.g:1258:1: ( ( rule__City__NameAssignment_1 ) )
            // InternalBTS.g:1259:2: ( rule__City__NameAssignment_1 )
            {
             before(grammarAccess.getCityAccess().getNameAssignment_1()); 
            // InternalBTS.g:1260:2: ( rule__City__NameAssignment_1 )
            // InternalBTS.g:1260:3: rule__City__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__City__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group__1__Impl"


    // $ANTLR start "rule__City__Group__2"
    // InternalBTS.g:1268:1: rule__City__Group__2 : rule__City__Group__2__Impl rule__City__Group__3 ;
    public final void rule__City__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:1272:1: ( rule__City__Group__2__Impl rule__City__Group__3 )
            // InternalBTS.g:1273:2: rule__City__Group__2__Impl rule__City__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__City__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__City__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group__2"


    // $ANTLR start "rule__City__Group__2__Impl"
    // InternalBTS.g:1280:1: rule__City__Group__2__Impl : ( '{' ) ;
    public final void rule__City__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:1284:1: ( ( '{' ) )
            // InternalBTS.g:1285:1: ( '{' )
            {
            // InternalBTS.g:1285:1: ( '{' )
            // InternalBTS.g:1286:2: '{'
            {
             before(grammarAccess.getCityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCityAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group__2__Impl"


    // $ANTLR start "rule__City__Group__3"
    // InternalBTS.g:1295:1: rule__City__Group__3 : rule__City__Group__3__Impl rule__City__Group__4 ;
    public final void rule__City__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:1299:1: ( rule__City__Group__3__Impl rule__City__Group__4 )
            // InternalBTS.g:1300:2: rule__City__Group__3__Impl rule__City__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__City__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__City__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group__3"


    // $ANTLR start "rule__City__Group__3__Impl"
    // InternalBTS.g:1307:1: rule__City__Group__3__Impl : ( ( rule__City__BusstopsAssignment_3 )* ) ;
    public final void rule__City__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:1311:1: ( ( ( rule__City__BusstopsAssignment_3 )* ) )
            // InternalBTS.g:1312:1: ( ( rule__City__BusstopsAssignment_3 )* )
            {
            // InternalBTS.g:1312:1: ( ( rule__City__BusstopsAssignment_3 )* )
            // InternalBTS.g:1313:2: ( rule__City__BusstopsAssignment_3 )*
            {
             before(grammarAccess.getCityAccess().getBusstopsAssignment_3()); 
            // InternalBTS.g:1314:2: ( rule__City__BusstopsAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=11 && LA4_0<=12)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBTS.g:1314:3: rule__City__BusstopsAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__City__BusstopsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getCityAccess().getBusstopsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group__3__Impl"


    // $ANTLR start "rule__City__Group__4"
    // InternalBTS.g:1322:1: rule__City__Group__4 : rule__City__Group__4__Impl ;
    public final void rule__City__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:1326:1: ( rule__City__Group__4__Impl )
            // InternalBTS.g:1327:2: rule__City__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__City__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group__4"


    // $ANTLR start "rule__City__Group__4__Impl"
    // InternalBTS.g:1333:1: rule__City__Group__4__Impl : ( '}' ) ;
    public final void rule__City__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:1337:1: ( ( '}' ) )
            // InternalBTS.g:1338:1: ( '}' )
            {
            // InternalBTS.g:1338:1: ( '}' )
            // InternalBTS.g:1339:2: '}'
            {
             before(grammarAccess.getCityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCityAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group__4__Impl"


    // $ANTLR start "rule__Seat__Group__0"
    // InternalBTS.g:1349:1: rule__Seat__Group__0 : rule__Seat__Group__0__Impl rule__Seat__Group__1 ;
    public final void rule__Seat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:1353:1: ( rule__Seat__Group__0__Impl rule__Seat__Group__1 )
            // InternalBTS.g:1354:2: rule__Seat__Group__0__Impl rule__Seat__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Seat__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Seat__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seat__Group__0"


    // $ANTLR start "rule__Seat__Group__0__Impl"
    // InternalBTS.g:1361:1: rule__Seat__Group__0__Impl : ( 'Seat' ) ;
    public final void rule__Seat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:1365:1: ( ( 'Seat' ) )
            // InternalBTS.g:1366:1: ( 'Seat' )
            {
            // InternalBTS.g:1366:1: ( 'Seat' )
            // InternalBTS.g:1367:2: 'Seat'
            {
             before(grammarAccess.getSeatAccess().getSeatKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSeatAccess().getSeatKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seat__Group__0__Impl"


    // $ANTLR start "rule__Seat__Group__1"
    // InternalBTS.g:1376:1: rule__Seat__Group__1 : rule__Seat__Group__1__Impl ;
    public final void rule__Seat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:1380:1: ( rule__Seat__Group__1__Impl )
            // InternalBTS.g:1381:2: rule__Seat__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Seat__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seat__Group__1"


    // $ANTLR start "rule__Seat__Group__1__Impl"
    // InternalBTS.g:1387:1: rule__Seat__Group__1__Impl : ( ( rule__Seat__NameAssignment_1 ) ) ;
    public final void rule__Seat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:1391:1: ( ( ( rule__Seat__NameAssignment_1 ) ) )
            // InternalBTS.g:1392:1: ( ( rule__Seat__NameAssignment_1 ) )
            {
            // InternalBTS.g:1392:1: ( ( rule__Seat__NameAssignment_1 ) )
            // InternalBTS.g:1393:2: ( rule__Seat__NameAssignment_1 )
            {
             before(grammarAccess.getSeatAccess().getNameAssignment_1()); 
            // InternalBTS.g:1394:2: ( rule__Seat__NameAssignment_1 )
            // InternalBTS.g:1394:3: rule__Seat__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Seat__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSeatAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seat__Group__1__Impl"


    // $ANTLR start "rule__BTS__ElementsAssignment"
    // InternalBTS.g:1403:1: rule__BTS__ElementsAssignment : ( ruleType ) ;
    public final void rule__BTS__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:1407:1: ( ( ruleType ) )
            // InternalBTS.g:1408:2: ( ruleType )
            {
            // InternalBTS.g:1408:2: ( ruleType )
            // InternalBTS.g:1409:3: ruleType
            {
             before(grammarAccess.getBTSAccess().getElementsTypeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getBTSAccess().getElementsTypeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTS__ElementsAssignment"


    // $ANTLR start "rule__Baggage__NameAssignment_1"
    // InternalBTS.g:1418:1: rule__Baggage__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Baggage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:1422:1: ( ( RULE_ID ) )
            // InternalBTS.g:1423:2: ( RULE_ID )
            {
            // InternalBTS.g:1423:2: ( RULE_ID )
            // InternalBTS.g:1424:3: RULE_ID
            {
             before(grammarAccess.getBaggageAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBaggageAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Baggage__NameAssignment_1"


    // $ANTLR start "rule__Booking__NameAssignment_1"
    // InternalBTS.g:1433:1: rule__Booking__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Booking__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:1437:1: ( ( RULE_ID ) )
            // InternalBTS.g:1438:2: ( RULE_ID )
            {
            // InternalBTS.g:1438:2: ( RULE_ID )
            // InternalBTS.g:1439:3: RULE_ID
            {
             before(grammarAccess.getBookingAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBookingAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Booking__NameAssignment_1"


    // $ANTLR start "rule__Ticket__NameAssignment_1"
    // InternalBTS.g:1448:1: rule__Ticket__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Ticket__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:1452:1: ( ( RULE_ID ) )
            // InternalBTS.g:1453:2: ( RULE_ID )
            {
            // InternalBTS.g:1453:2: ( RULE_ID )
            // InternalBTS.g:1454:3: RULE_ID
            {
             before(grammarAccess.getTicketAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTicketAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ticket__NameAssignment_1"


    // $ANTLR start "rule__Passenger__NameAssignment_1"
    // InternalBTS.g:1463:1: rule__Passenger__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Passenger__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:1467:1: ( ( RULE_ID ) )
            // InternalBTS.g:1468:2: ( RULE_ID )
            {
            // InternalBTS.g:1468:2: ( RULE_ID )
            // InternalBTS.g:1469:3: RULE_ID
            {
             before(grammarAccess.getPassengerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPassengerAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passenger__NameAssignment_1"


    // $ANTLR start "rule__Payment__NameAssignment_1"
    // InternalBTS.g:1478:1: rule__Payment__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Payment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:1482:1: ( ( RULE_ID ) )
            // InternalBTS.g:1483:2: ( RULE_ID )
            {
            // InternalBTS.g:1483:2: ( RULE_ID )
            // InternalBTS.g:1484:3: RULE_ID
            {
             before(grammarAccess.getPaymentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPaymentAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Payment__NameAssignment_1"


    // $ANTLR start "rule__OnlinePayment__NameAssignment_1"
    // InternalBTS.g:1493:1: rule__OnlinePayment__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__OnlinePayment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:1497:1: ( ( RULE_ID ) )
            // InternalBTS.g:1498:2: ( RULE_ID )
            {
            // InternalBTS.g:1498:2: ( RULE_ID )
            // InternalBTS.g:1499:3: RULE_ID
            {
             before(grammarAccess.getOnlinePaymentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOnlinePaymentAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnlinePayment__NameAssignment_1"


    // $ANTLR start "rule__OnlinePayment__SuperTypeAssignment_2_1"
    // InternalBTS.g:1508:1: rule__OnlinePayment__SuperTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__OnlinePayment__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:1512:1: ( ( ( RULE_ID ) ) )
            // InternalBTS.g:1513:2: ( ( RULE_ID ) )
            {
            // InternalBTS.g:1513:2: ( ( RULE_ID ) )
            // InternalBTS.g:1514:3: ( RULE_ID )
            {
             before(grammarAccess.getOnlinePaymentAccess().getSuperTypePaymentCrossReference_2_1_0()); 
            // InternalBTS.g:1515:3: ( RULE_ID )
            // InternalBTS.g:1516:4: RULE_ID
            {
             before(grammarAccess.getOnlinePaymentAccess().getSuperTypePaymentIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOnlinePaymentAccess().getSuperTypePaymentIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getOnlinePaymentAccess().getSuperTypePaymentCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnlinePayment__SuperTypeAssignment_2_1"


    // $ANTLR start "rule__KIOSK__NameAssignment_1"
    // InternalBTS.g:1527:1: rule__KIOSK__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__KIOSK__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:1531:1: ( ( RULE_ID ) )
            // InternalBTS.g:1532:2: ( RULE_ID )
            {
            // InternalBTS.g:1532:2: ( RULE_ID )
            // InternalBTS.g:1533:3: RULE_ID
            {
             before(grammarAccess.getKIOSKAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getKIOSKAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KIOSK__NameAssignment_1"


    // $ANTLR start "rule__KIOSK__SuperTypeAssignment_2_1"
    // InternalBTS.g:1542:1: rule__KIOSK__SuperTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__KIOSK__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:1546:1: ( ( ( RULE_ID ) ) )
            // InternalBTS.g:1547:2: ( ( RULE_ID ) )
            {
            // InternalBTS.g:1547:2: ( ( RULE_ID ) )
            // InternalBTS.g:1548:3: ( RULE_ID )
            {
             before(grammarAccess.getKIOSKAccess().getSuperTypePaymentCrossReference_2_1_0()); 
            // InternalBTS.g:1549:3: ( RULE_ID )
            // InternalBTS.g:1550:4: RULE_ID
            {
             before(grammarAccess.getKIOSKAccess().getSuperTypePaymentIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getKIOSKAccess().getSuperTypePaymentIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getKIOSKAccess().getSuperTypePaymentCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KIOSK__SuperTypeAssignment_2_1"


    // $ANTLR start "rule__Bus__NameAssignment_1"
    // InternalBTS.g:1561:1: rule__Bus__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Bus__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:1565:1: ( ( RULE_ID ) )
            // InternalBTS.g:1566:2: ( RULE_ID )
            {
            // InternalBTS.g:1566:2: ( RULE_ID )
            // InternalBTS.g:1567:3: RULE_ID
            {
             before(grammarAccess.getBusAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBusAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bus__NameAssignment_1"


    // $ANTLR start "rule__City__NameAssignment_1"
    // InternalBTS.g:1576:1: rule__City__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__City__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:1580:1: ( ( RULE_ID ) )
            // InternalBTS.g:1581:2: ( RULE_ID )
            {
            // InternalBTS.g:1581:2: ( RULE_ID )
            // InternalBTS.g:1582:3: RULE_ID
            {
             before(grammarAccess.getCityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__NameAssignment_1"


    // $ANTLR start "rule__City__BusstopsAssignment_3"
    // InternalBTS.g:1591:1: rule__City__BusstopsAssignment_3 : ( rulePoint ) ;
    public final void rule__City__BusstopsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:1595:1: ( ( rulePoint ) )
            // InternalBTS.g:1596:2: ( rulePoint )
            {
            // InternalBTS.g:1596:2: ( rulePoint )
            // InternalBTS.g:1597:3: rulePoint
            {
             before(grammarAccess.getCityAccess().getBusstopsPointEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getCityAccess().getBusstopsPointEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__BusstopsAssignment_3"


    // $ANTLR start "rule__Seat__NameAssignment_1"
    // InternalBTS.g:1606:1: rule__Seat__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Seat__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBTS.g:1610:1: ( ( RULE_ID ) )
            // InternalBTS.g:1611:2: ( RULE_ID )
            {
            // InternalBTS.g:1611:2: ( RULE_ID )
            // InternalBTS.g:1612:3: RULE_ID
            {
             before(grammarAccess.getSeatAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSeatAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seat__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000003C7E002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000101800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000001802L});

}