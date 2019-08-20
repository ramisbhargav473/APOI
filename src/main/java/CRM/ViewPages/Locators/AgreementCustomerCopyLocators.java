package CRM.ViewPages.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import CRM.ViewPages.Locators.Constants.ACC_LocatorsConstants;

/**
 * @author jteja
 *
 */
public class AgreementCustomerCopyLocators {

	@FindBy(css = ACC_LocatorsConstants.ACC_STATUS_DISPLAY)
	public WebElement acc_status_display;
	@FindBy(css = ACC_LocatorsConstants.ACC_AGREE_TNC_CHECKBOX)
	public WebElement acc_agree_tnc_checkbox;
	@FindBy(css = ACC_LocatorsConstants.ACC_DOWNLOAD_BUTTON)
	public WebElement acc_download_button;
	@FindBy(css = ACC_LocatorsConstants.ACC_EDIT_AGREEMENT_BUTTON)
	public WebElement acc_edit_agreement_button;
	@FindBy(css = ACC_LocatorsConstants.ACC_MARK_AS_SIGNED_BUTTON)
	public WebElement acc_mark_as_signed_button;
	@FindBy(css = ACC_LocatorsConstants.ACC_CSA_SIGN_CONFIRM_CHECKBOX)
	public WebElement acc_csa_sign_confirm_checkbox;
	@FindBy(css = ACC_LocatorsConstants.ACC_UPLOAD_DOCUMENT_TEXTFIELD)
	public WebElement acc_upload_document_textfield;
	@FindBy(css = ACC_LocatorsConstants.ACC_DISCARD_POPUP_BUTTON)
	public WebElement acc_discard_popup_button;
	@FindBy(css = ACC_LocatorsConstants.ACC_SUBMIT_DOCUMENT_BUTTON)
	public WebElement acc_submit_document_button;
	@FindBy(css = ACC_LocatorsConstants.ACC_SEND_EMAIL_BUTTON)
	public WebElement acc_send_email_button;

}
