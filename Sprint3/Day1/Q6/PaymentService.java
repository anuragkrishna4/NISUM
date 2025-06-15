public class PaymentService {

    public void paymentMethod(String paymentType, String offerCode) throws PaymentException {
        if (!paymentType.equalsIgnoreCase("UPI") && !paymentType.equalsIgnoreCase("Card")) {
            throw new InvalidPaymentMethodException("Invalid payment method: " + paymentType);
        }

        if (!offerCode.equalsIgnoreCase("OFF10") && !offerCode.equalsIgnoreCase("SAVE20")) {
            throw new InvalidOfferAppliedException("Invalid offer code: " + offerCode);
        }

        System.out.println("Payment done using " + paymentType + " with offer " + offerCode);
    }

    public void processPaymentMethod(String paymentType, String offerCode) {
        try {
            paymentMethod(paymentType, offerCode);
        } catch (InvalidPaymentMethodException e) {
            System.out.println("Handled InvalidPaymentMethodException: " + e.getMessage());
        } catch (InvalidOfferAppliedException e) {
            System.out.println("Handled InvalidOfferAppliedException: " + e.getMessage());
        } catch (PaymentException e) {
            System.out.println("General PaymentException: " + e.getMessage());
        }
    }
}
