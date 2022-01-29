package org.xtext.example.bts.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.bts.services.BTSGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBTSParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Baggage'", "'Booking'", "'Ticket'", "'Passenger'", "'Payment'", "'OnlinePayment'", "'extends'", "'{'", "'}'", "'KIOSK'", "'Bus'", "'City'", "'Seat'", "'ARRIVAL_POINT'", "'DEPARTURE_POINT'"
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

        public InternalBTSParser(TokenStream input, BTSGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "BTS";
       	}

       	@Override
       	protected BTSGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleBTS"
    // InternalBTS.g:65:1: entryRuleBTS returns [EObject current=null] : iv_ruleBTS= ruleBTS EOF ;
    public final EObject entryRuleBTS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBTS = null;


        try {
            // InternalBTS.g:65:44: (iv_ruleBTS= ruleBTS EOF )
            // InternalBTS.g:66:2: iv_ruleBTS= ruleBTS EOF
            {
             newCompositeNode(grammarAccess.getBTSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBTS=ruleBTS();

            state._fsp--;

             current =iv_ruleBTS; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBTS"


    // $ANTLR start "ruleBTS"
    // InternalBTS.g:72:1: ruleBTS returns [EObject current=null] : ( (lv_elements_0_0= ruleType ) )* ;
    public final EObject ruleBTS() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalBTS.g:78:2: ( ( (lv_elements_0_0= ruleType ) )* )
            // InternalBTS.g:79:2: ( (lv_elements_0_0= ruleType ) )*
            {
            // InternalBTS.g:79:2: ( (lv_elements_0_0= ruleType ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=16)||(LA1_0>=20 && LA1_0<=23)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBTS.g:80:3: (lv_elements_0_0= ruleType )
            	    {
            	    // InternalBTS.g:80:3: (lv_elements_0_0= ruleType )
            	    // InternalBTS.g:81:4: lv_elements_0_0= ruleType
            	    {

            	    				newCompositeNode(grammarAccess.getBTSAccess().getElementsTypeParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleType();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getBTSRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"org.xtext.example.bts.BTS.Type");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBTS"


    // $ANTLR start "entryRuleType"
    // InternalBTS.g:101:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalBTS.g:101:45: (iv_ruleType= ruleType EOF )
            // InternalBTS.g:102:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalBTS.g:108:1: ruleType returns [EObject current=null] : (this_City_0= ruleCity | this_Seat_1= ruleSeat | this_Bus_2= ruleBus | this_Passenger_3= rulePassenger | this_Ticket_4= ruleTicket | this_Booking_5= ruleBooking | this_Baggage_6= ruleBaggage | this_Payment_7= rulePayment | this_OnlinePayment_8= ruleOnlinePayment | this_KIOSK_9= ruleKIOSK ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_City_0 = null;

        EObject this_Seat_1 = null;

        EObject this_Bus_2 = null;

        EObject this_Passenger_3 = null;

        EObject this_Ticket_4 = null;

        EObject this_Booking_5 = null;

        EObject this_Baggage_6 = null;

        EObject this_Payment_7 = null;

        EObject this_OnlinePayment_8 = null;

        EObject this_KIOSK_9 = null;



        	enterRule();

        try {
            // InternalBTS.g:114:2: ( (this_City_0= ruleCity | this_Seat_1= ruleSeat | this_Bus_2= ruleBus | this_Passenger_3= rulePassenger | this_Ticket_4= ruleTicket | this_Booking_5= ruleBooking | this_Baggage_6= ruleBaggage | this_Payment_7= rulePayment | this_OnlinePayment_8= ruleOnlinePayment | this_KIOSK_9= ruleKIOSK ) )
            // InternalBTS.g:115:2: (this_City_0= ruleCity | this_Seat_1= ruleSeat | this_Bus_2= ruleBus | this_Passenger_3= rulePassenger | this_Ticket_4= ruleTicket | this_Booking_5= ruleBooking | this_Baggage_6= ruleBaggage | this_Payment_7= rulePayment | this_OnlinePayment_8= ruleOnlinePayment | this_KIOSK_9= ruleKIOSK )
            {
            // InternalBTS.g:115:2: (this_City_0= ruleCity | this_Seat_1= ruleSeat | this_Bus_2= ruleBus | this_Passenger_3= rulePassenger | this_Ticket_4= ruleTicket | this_Booking_5= ruleBooking | this_Baggage_6= ruleBaggage | this_Payment_7= rulePayment | this_OnlinePayment_8= ruleOnlinePayment | this_KIOSK_9= ruleKIOSK )
            int alt2=10;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt2=1;
                }
                break;
            case 23:
                {
                alt2=2;
                }
                break;
            case 21:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            case 13:
                {
                alt2=5;
                }
                break;
            case 12:
                {
                alt2=6;
                }
                break;
            case 11:
                {
                alt2=7;
                }
                break;
            case 15:
                {
                alt2=8;
                }
                break;
            case 16:
                {
                alt2=9;
                }
                break;
            case 20:
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
                    // InternalBTS.g:116:3: this_City_0= ruleCity
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getCityParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_City_0=ruleCity();

                    state._fsp--;


                    			current = this_City_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBTS.g:125:3: this_Seat_1= ruleSeat
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getSeatParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Seat_1=ruleSeat();

                    state._fsp--;


                    			current = this_Seat_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBTS.g:134:3: this_Bus_2= ruleBus
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getBusParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Bus_2=ruleBus();

                    state._fsp--;


                    			current = this_Bus_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalBTS.g:143:3: this_Passenger_3= rulePassenger
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getPassengerParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Passenger_3=rulePassenger();

                    state._fsp--;


                    			current = this_Passenger_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalBTS.g:152:3: this_Ticket_4= ruleTicket
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getTicketParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Ticket_4=ruleTicket();

                    state._fsp--;


                    			current = this_Ticket_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalBTS.g:161:3: this_Booking_5= ruleBooking
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getBookingParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Booking_5=ruleBooking();

                    state._fsp--;


                    			current = this_Booking_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalBTS.g:170:3: this_Baggage_6= ruleBaggage
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getBaggageParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Baggage_6=ruleBaggage();

                    state._fsp--;


                    			current = this_Baggage_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalBTS.g:179:3: this_Payment_7= rulePayment
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getPaymentParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Payment_7=rulePayment();

                    state._fsp--;


                    			current = this_Payment_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalBTS.g:188:3: this_OnlinePayment_8= ruleOnlinePayment
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getOnlinePaymentParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_OnlinePayment_8=ruleOnlinePayment();

                    state._fsp--;


                    			current = this_OnlinePayment_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalBTS.g:197:3: this_KIOSK_9= ruleKIOSK
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getKIOSKParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_KIOSK_9=ruleKIOSK();

                    state._fsp--;


                    			current = this_KIOSK_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleBaggage"
    // InternalBTS.g:209:1: entryRuleBaggage returns [EObject current=null] : iv_ruleBaggage= ruleBaggage EOF ;
    public final EObject entryRuleBaggage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaggage = null;


        try {
            // InternalBTS.g:209:48: (iv_ruleBaggage= ruleBaggage EOF )
            // InternalBTS.g:210:2: iv_ruleBaggage= ruleBaggage EOF
            {
             newCompositeNode(grammarAccess.getBaggageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBaggage=ruleBaggage();

            state._fsp--;

             current =iv_ruleBaggage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBaggage"


    // $ANTLR start "ruleBaggage"
    // InternalBTS.g:216:1: ruleBaggage returns [EObject current=null] : (otherlv_0= 'Baggage' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleBaggage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalBTS.g:222:2: ( (otherlv_0= 'Baggage' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalBTS.g:223:2: (otherlv_0= 'Baggage' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalBTS.g:223:2: (otherlv_0= 'Baggage' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalBTS.g:224:3: otherlv_0= 'Baggage' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBaggageAccess().getBaggageKeyword_0());
            		
            // InternalBTS.g:228:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBTS.g:229:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBTS.g:229:4: (lv_name_1_0= RULE_ID )
            // InternalBTS.g:230:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBaggageAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBaggageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBaggage"


    // $ANTLR start "entryRuleBooking"
    // InternalBTS.g:250:1: entryRuleBooking returns [EObject current=null] : iv_ruleBooking= ruleBooking EOF ;
    public final EObject entryRuleBooking() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooking = null;


        try {
            // InternalBTS.g:250:48: (iv_ruleBooking= ruleBooking EOF )
            // InternalBTS.g:251:2: iv_ruleBooking= ruleBooking EOF
            {
             newCompositeNode(grammarAccess.getBookingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooking=ruleBooking();

            state._fsp--;

             current =iv_ruleBooking; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooking"


    // $ANTLR start "ruleBooking"
    // InternalBTS.g:257:1: ruleBooking returns [EObject current=null] : (otherlv_0= 'Booking' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleBooking() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalBTS.g:263:2: ( (otherlv_0= 'Booking' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalBTS.g:264:2: (otherlv_0= 'Booking' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalBTS.g:264:2: (otherlv_0= 'Booking' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalBTS.g:265:3: otherlv_0= 'Booking' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBookingAccess().getBookingKeyword_0());
            		
            // InternalBTS.g:269:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBTS.g:270:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBTS.g:270:4: (lv_name_1_0= RULE_ID )
            // InternalBTS.g:271:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBookingAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBookingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooking"


    // $ANTLR start "entryRuleTicket"
    // InternalBTS.g:291:1: entryRuleTicket returns [EObject current=null] : iv_ruleTicket= ruleTicket EOF ;
    public final EObject entryRuleTicket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTicket = null;


        try {
            // InternalBTS.g:291:47: (iv_ruleTicket= ruleTicket EOF )
            // InternalBTS.g:292:2: iv_ruleTicket= ruleTicket EOF
            {
             newCompositeNode(grammarAccess.getTicketRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTicket=ruleTicket();

            state._fsp--;

             current =iv_ruleTicket; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTicket"


    // $ANTLR start "ruleTicket"
    // InternalBTS.g:298:1: ruleTicket returns [EObject current=null] : (otherlv_0= 'Ticket' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleTicket() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalBTS.g:304:2: ( (otherlv_0= 'Ticket' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalBTS.g:305:2: (otherlv_0= 'Ticket' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalBTS.g:305:2: (otherlv_0= 'Ticket' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalBTS.g:306:3: otherlv_0= 'Ticket' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTicketAccess().getTicketKeyword_0());
            		
            // InternalBTS.g:310:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBTS.g:311:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBTS.g:311:4: (lv_name_1_0= RULE_ID )
            // InternalBTS.g:312:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTicketAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTicketRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTicket"


    // $ANTLR start "entryRulePassenger"
    // InternalBTS.g:332:1: entryRulePassenger returns [EObject current=null] : iv_rulePassenger= rulePassenger EOF ;
    public final EObject entryRulePassenger() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePassenger = null;


        try {
            // InternalBTS.g:332:50: (iv_rulePassenger= rulePassenger EOF )
            // InternalBTS.g:333:2: iv_rulePassenger= rulePassenger EOF
            {
             newCompositeNode(grammarAccess.getPassengerRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePassenger=rulePassenger();

            state._fsp--;

             current =iv_rulePassenger; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePassenger"


    // $ANTLR start "rulePassenger"
    // InternalBTS.g:339:1: rulePassenger returns [EObject current=null] : (otherlv_0= 'Passenger' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePassenger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalBTS.g:345:2: ( (otherlv_0= 'Passenger' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalBTS.g:346:2: (otherlv_0= 'Passenger' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalBTS.g:346:2: (otherlv_0= 'Passenger' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalBTS.g:347:3: otherlv_0= 'Passenger' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPassengerAccess().getPassengerKeyword_0());
            		
            // InternalBTS.g:351:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBTS.g:352:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBTS.g:352:4: (lv_name_1_0= RULE_ID )
            // InternalBTS.g:353:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPassengerAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPassengerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePassenger"


    // $ANTLR start "entryRulePayment"
    // InternalBTS.g:373:1: entryRulePayment returns [EObject current=null] : iv_rulePayment= rulePayment EOF ;
    public final EObject entryRulePayment() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePayment = null;


        try {
            // InternalBTS.g:373:48: (iv_rulePayment= rulePayment EOF )
            // InternalBTS.g:374:2: iv_rulePayment= rulePayment EOF
            {
             newCompositeNode(grammarAccess.getPaymentRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePayment=rulePayment();

            state._fsp--;

             current =iv_rulePayment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePayment"


    // $ANTLR start "rulePayment"
    // InternalBTS.g:380:1: rulePayment returns [EObject current=null] : (otherlv_0= 'Payment' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePayment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalBTS.g:386:2: ( (otherlv_0= 'Payment' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalBTS.g:387:2: (otherlv_0= 'Payment' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalBTS.g:387:2: (otherlv_0= 'Payment' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalBTS.g:388:3: otherlv_0= 'Payment' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPaymentAccess().getPaymentKeyword_0());
            		
            // InternalBTS.g:392:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBTS.g:393:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBTS.g:393:4: (lv_name_1_0= RULE_ID )
            // InternalBTS.g:394:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPaymentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPaymentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePayment"


    // $ANTLR start "entryRuleOnlinePayment"
    // InternalBTS.g:414:1: entryRuleOnlinePayment returns [EObject current=null] : iv_ruleOnlinePayment= ruleOnlinePayment EOF ;
    public final EObject entryRuleOnlinePayment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnlinePayment = null;


        try {
            // InternalBTS.g:414:54: (iv_ruleOnlinePayment= ruleOnlinePayment EOF )
            // InternalBTS.g:415:2: iv_ruleOnlinePayment= ruleOnlinePayment EOF
            {
             newCompositeNode(grammarAccess.getOnlinePaymentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOnlinePayment=ruleOnlinePayment();

            state._fsp--;

             current =iv_ruleOnlinePayment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOnlinePayment"


    // $ANTLR start "ruleOnlinePayment"
    // InternalBTS.g:421:1: ruleOnlinePayment returns [EObject current=null] : (otherlv_0= 'OnlinePayment' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) ) otherlv_4= '{' otherlv_5= '}' ) ;
    public final EObject ruleOnlinePayment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalBTS.g:427:2: ( (otherlv_0= 'OnlinePayment' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) ) otherlv_4= '{' otherlv_5= '}' ) )
            // InternalBTS.g:428:2: (otherlv_0= 'OnlinePayment' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) ) otherlv_4= '{' otherlv_5= '}' )
            {
            // InternalBTS.g:428:2: (otherlv_0= 'OnlinePayment' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) ) otherlv_4= '{' otherlv_5= '}' )
            // InternalBTS.g:429:3: otherlv_0= 'OnlinePayment' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) ) otherlv_4= '{' otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOnlinePaymentAccess().getOnlinePaymentKeyword_0());
            		
            // InternalBTS.g:433:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBTS.g:434:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBTS.g:434:4: (lv_name_1_0= RULE_ID )
            // InternalBTS.g:435:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getOnlinePaymentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOnlinePaymentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalBTS.g:451:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )
            // InternalBTS.g:452:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_2=(Token)match(input,17,FOLLOW_4); 

            				newLeafNode(otherlv_2, grammarAccess.getOnlinePaymentAccess().getExtendsKeyword_2_0());
            			
            // InternalBTS.g:456:4: ( (otherlv_3= RULE_ID ) )
            // InternalBTS.g:457:5: (otherlv_3= RULE_ID )
            {
            // InternalBTS.g:457:5: (otherlv_3= RULE_ID )
            // InternalBTS.g:458:6: otherlv_3= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getOnlinePaymentRule());
            						}
            					
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

            						newLeafNode(otherlv_3, grammarAccess.getOnlinePaymentAccess().getSuperTypePaymentCrossReference_2_1_0());
            					

            }


            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getOnlinePaymentAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_5=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getOnlinePaymentAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOnlinePayment"


    // $ANTLR start "entryRuleKIOSK"
    // InternalBTS.g:482:1: entryRuleKIOSK returns [EObject current=null] : iv_ruleKIOSK= ruleKIOSK EOF ;
    public final EObject entryRuleKIOSK() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKIOSK = null;


        try {
            // InternalBTS.g:482:46: (iv_ruleKIOSK= ruleKIOSK EOF )
            // InternalBTS.g:483:2: iv_ruleKIOSK= ruleKIOSK EOF
            {
             newCompositeNode(grammarAccess.getKIOSKRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKIOSK=ruleKIOSK();

            state._fsp--;

             current =iv_ruleKIOSK; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKIOSK"


    // $ANTLR start "ruleKIOSK"
    // InternalBTS.g:489:1: ruleKIOSK returns [EObject current=null] : (otherlv_0= 'KIOSK' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) ) otherlv_4= '{' otherlv_5= '}' ) ;
    public final EObject ruleKIOSK() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalBTS.g:495:2: ( (otherlv_0= 'KIOSK' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) ) otherlv_4= '{' otherlv_5= '}' ) )
            // InternalBTS.g:496:2: (otherlv_0= 'KIOSK' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) ) otherlv_4= '{' otherlv_5= '}' )
            {
            // InternalBTS.g:496:2: (otherlv_0= 'KIOSK' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) ) otherlv_4= '{' otherlv_5= '}' )
            // InternalBTS.g:497:3: otherlv_0= 'KIOSK' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) ) otherlv_4= '{' otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getKIOSKAccess().getKIOSKKeyword_0());
            		
            // InternalBTS.g:501:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBTS.g:502:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBTS.g:502:4: (lv_name_1_0= RULE_ID )
            // InternalBTS.g:503:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getKIOSKAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getKIOSKRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalBTS.g:519:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )
            // InternalBTS.g:520:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_2=(Token)match(input,17,FOLLOW_4); 

            				newLeafNode(otherlv_2, grammarAccess.getKIOSKAccess().getExtendsKeyword_2_0());
            			
            // InternalBTS.g:524:4: ( (otherlv_3= RULE_ID ) )
            // InternalBTS.g:525:5: (otherlv_3= RULE_ID )
            {
            // InternalBTS.g:525:5: (otherlv_3= RULE_ID )
            // InternalBTS.g:526:6: otherlv_3= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getKIOSKRule());
            						}
            					
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

            						newLeafNode(otherlv_3, grammarAccess.getKIOSKAccess().getSuperTypePaymentCrossReference_2_1_0());
            					

            }


            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getKIOSKAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_5=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getKIOSKAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKIOSK"


    // $ANTLR start "entryRuleBus"
    // InternalBTS.g:550:1: entryRuleBus returns [EObject current=null] : iv_ruleBus= ruleBus EOF ;
    public final EObject entryRuleBus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBus = null;


        try {
            // InternalBTS.g:550:44: (iv_ruleBus= ruleBus EOF )
            // InternalBTS.g:551:2: iv_ruleBus= ruleBus EOF
            {
             newCompositeNode(grammarAccess.getBusRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBus=ruleBus();

            state._fsp--;

             current =iv_ruleBus; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBus"


    // $ANTLR start "ruleBus"
    // InternalBTS.g:557:1: ruleBus returns [EObject current=null] : (otherlv_0= 'Bus' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleBus() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalBTS.g:563:2: ( (otherlv_0= 'Bus' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) )
            // InternalBTS.g:564:2: (otherlv_0= 'Bus' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            {
            // InternalBTS.g:564:2: (otherlv_0= 'Bus' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            // InternalBTS.g:565:3: otherlv_0= 'Bus' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBusAccess().getBusKeyword_0());
            		
            // InternalBTS.g:569:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBTS.g:570:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBTS.g:570:4: (lv_name_1_0= RULE_ID )
            // InternalBTS.g:571:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBusAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBusRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getBusAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getBusAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBus"


    // $ANTLR start "entryRuleCity"
    // InternalBTS.g:599:1: entryRuleCity returns [EObject current=null] : iv_ruleCity= ruleCity EOF ;
    public final EObject entryRuleCity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCity = null;


        try {
            // InternalBTS.g:599:45: (iv_ruleCity= ruleCity EOF )
            // InternalBTS.g:600:2: iv_ruleCity= ruleCity EOF
            {
             newCompositeNode(grammarAccess.getCityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCity=ruleCity();

            state._fsp--;

             current =iv_ruleCity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCity"


    // $ANTLR start "ruleCity"
    // InternalBTS.g:606:1: ruleCity returns [EObject current=null] : (otherlv_0= 'City' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_busstops_3_0= rulePoint ) )* otherlv_4= '}' ) ;
    public final EObject ruleCity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_busstops_3_0 = null;



        	enterRule();

        try {
            // InternalBTS.g:612:2: ( (otherlv_0= 'City' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_busstops_3_0= rulePoint ) )* otherlv_4= '}' ) )
            // InternalBTS.g:613:2: (otherlv_0= 'City' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_busstops_3_0= rulePoint ) )* otherlv_4= '}' )
            {
            // InternalBTS.g:613:2: (otherlv_0= 'City' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_busstops_3_0= rulePoint ) )* otherlv_4= '}' )
            // InternalBTS.g:614:3: otherlv_0= 'City' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_busstops_3_0= rulePoint ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCityAccess().getCityKeyword_0());
            		
            // InternalBTS.g:618:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBTS.g:619:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBTS.g:619:4: (lv_name_1_0= RULE_ID )
            // InternalBTS.g:620:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getCityAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBTS.g:640:3: ( (lv_busstops_3_0= rulePoint ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=24 && LA3_0<=25)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBTS.g:641:4: (lv_busstops_3_0= rulePoint )
            	    {
            	    // InternalBTS.g:641:4: (lv_busstops_3_0= rulePoint )
            	    // InternalBTS.g:642:5: lv_busstops_3_0= rulePoint
            	    {

            	    					newCompositeNode(grammarAccess.getCityAccess().getBusstopsPointEnumRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_busstops_3_0=rulePoint();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"busstops",
            	    						lv_busstops_3_0,
            	    						"org.xtext.example.bts.BTS.Point");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getCityAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCity"


    // $ANTLR start "entryRuleSeat"
    // InternalBTS.g:667:1: entryRuleSeat returns [EObject current=null] : iv_ruleSeat= ruleSeat EOF ;
    public final EObject entryRuleSeat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSeat = null;


        try {
            // InternalBTS.g:667:45: (iv_ruleSeat= ruleSeat EOF )
            // InternalBTS.g:668:2: iv_ruleSeat= ruleSeat EOF
            {
             newCompositeNode(grammarAccess.getSeatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSeat=ruleSeat();

            state._fsp--;

             current =iv_ruleSeat; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSeat"


    // $ANTLR start "ruleSeat"
    // InternalBTS.g:674:1: ruleSeat returns [EObject current=null] : (otherlv_0= 'Seat' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSeat() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalBTS.g:680:2: ( (otherlv_0= 'Seat' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalBTS.g:681:2: (otherlv_0= 'Seat' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalBTS.g:681:2: (otherlv_0= 'Seat' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalBTS.g:682:3: otherlv_0= 'Seat' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSeatAccess().getSeatKeyword_0());
            		
            // InternalBTS.g:686:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBTS.g:687:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBTS.g:687:4: (lv_name_1_0= RULE_ID )
            // InternalBTS.g:688:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSeatAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSeatRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSeat"


    // $ANTLR start "rulePoint"
    // InternalBTS.g:708:1: rulePoint returns [Enumerator current=null] : ( (enumLiteral_0= 'ARRIVAL_POINT' ) | (enumLiteral_1= 'DEPARTURE_POINT' ) ) ;
    public final Enumerator rulePoint() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalBTS.g:714:2: ( ( (enumLiteral_0= 'ARRIVAL_POINT' ) | (enumLiteral_1= 'DEPARTURE_POINT' ) ) )
            // InternalBTS.g:715:2: ( (enumLiteral_0= 'ARRIVAL_POINT' ) | (enumLiteral_1= 'DEPARTURE_POINT' ) )
            {
            // InternalBTS.g:715:2: ( (enumLiteral_0= 'ARRIVAL_POINT' ) | (enumLiteral_1= 'DEPARTURE_POINT' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==24) ) {
                alt4=1;
            }
            else if ( (LA4_0==25) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalBTS.g:716:3: (enumLiteral_0= 'ARRIVAL_POINT' )
                    {
                    // InternalBTS.g:716:3: (enumLiteral_0= 'ARRIVAL_POINT' )
                    // InternalBTS.g:717:4: enumLiteral_0= 'ARRIVAL_POINT'
                    {
                    enumLiteral_0=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getPointAccess().getARRIVAL_POINTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPointAccess().getARRIVAL_POINTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBTS.g:724:3: (enumLiteral_1= 'DEPARTURE_POINT' )
                    {
                    // InternalBTS.g:724:3: (enumLiteral_1= 'DEPARTURE_POINT' )
                    // InternalBTS.g:725:4: enumLiteral_1= 'DEPARTURE_POINT'
                    {
                    enumLiteral_1=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getPointAccess().getDEPARTURE_POINTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPointAccess().getDEPARTURE_POINTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePoint"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000F1F802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000003080000L});

}