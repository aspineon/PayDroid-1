package jp.alij.paydroid.data;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * 
 * @author canu johann
 * アナザーレーン（株）
 * http://www.alij.ne.jp
 * 
 * activity間で利用するため、Parcelable継承
 *
 */
public class TransactionRequest implements Parcelable {

	//決済画面を表示するための必須パラメータ
	public String siteId;	
	public String sitePass;	
	public int amount;
	
	//quickチャージ
	public int quickChargeStatus;
	
	//任意項目
	public String customerId;
	public String customerPass;
	public String transactionId;
	public String itemId;
	
	//ユーザー情報の表示・非表示
	public int visibility_zip;	
	public int visibility_capital;
	public int visibility_adr1;
	public int visibility_adr2;
	public int visibility_name;
	public int visibility_mail;
	public int visibility_country;	
	public int visibility_tel;
	public int visibility_note;
	
	//クイックチャージで利用
	public String cardName;
	public String cardNo;
	public String cardMonth;
	public String cardYear;
	
	public TransactionRequest() {}
	
	public TransactionRequest(Parcel in) {
		readFromParcel(in);
	}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		
		dest.writeInt(this.quickChargeStatus);

		dest.writeString(this.siteId);
		dest.writeString(this.sitePass);
		dest.writeString(this.customerId);
		dest.writeString(this.customerPass);		
		dest.writeString(this.transactionId);
		dest.writeString(this.itemId);
		
		dest.writeInt(this.amount);

		dest.writeInt(this.visibility_zip);
		dest.writeInt(this.visibility_capital);
		dest.writeInt(this.visibility_adr1);
		dest.writeInt(this.visibility_adr2);
		dest.writeInt(this.visibility_name);
		dest.writeInt(this.visibility_mail);
		dest.writeInt(this.visibility_country);
		dest.writeInt(this.visibility_tel);
		dest.writeInt(this.visibility_note);

		dest.writeString(this.cardName);
		dest.writeString(this.cardNo);
		dest.writeString(this.cardMonth);
		dest.writeString(this.cardYear);
	
		
	}

	private void readFromParcel(Parcel in) {
		
		this.quickChargeStatus = in.readInt();
		
		this.siteId = in.readString();
		this.sitePass = in.readString();
		this.customerId = in.readString();
		this.customerPass = in.readString();
		this.transactionId = in.readString();
		this.itemId = in.readString();
		
		this.amount = in.readInt();
		this.visibility_zip = in.readInt();
		this.visibility_capital = in.readInt();
		this.visibility_adr1 = in.readInt();
		this.visibility_adr2 = in.readInt();
		this.visibility_name = in.readInt();
		this.visibility_mail = in.readInt();
		this.visibility_country = in.readInt();
		this.visibility_tel = in.readInt();
		this.visibility_note= in.readInt();
		
		this.cardName = in.readString();
		this.cardNo = in.readString();
		this.cardMonth = in.readString();
		this.cardYear = in.readString();
		
	}

	@SuppressWarnings("rawtypes")
	public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
		public TransactionRequest createFromParcel(Parcel in) {
			return new TransactionRequest(in);
		}

		public TransactionRequest[] newArray(int size) {
			return new TransactionRequest[size];
		}
	};


	public String getSiteId() {
		return siteId;
	}

	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}

	public String getSitePass() {
		return sitePass;
	}

	public void setSitePass(String sitePass) {
		this.sitePass = sitePass;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerPass() {
		return customerPass;
	}

	public void setCustomerPass(String customerPass) {
		this.customerPass = customerPass;
	}
	
	public int getVisibility_zip() {
		return visibility_zip;
	}

	public void setVisibility_zip(int visibility_zip) {
		this.visibility_zip = visibility_zip;
	}

	public int getVisibility_capital() {
		return visibility_capital;
	}

	public void setVisibility_capital(int visibility_capital) {
		this.visibility_capital = visibility_capital;
	}

	public int getVisibility_adr1() {
		return visibility_adr1;
	}

	public void setVisibility_adr1(int visibility_adr1) {
		this.visibility_adr1 = visibility_adr1;
	}

	public int getVisibility_adr2() {
		return visibility_adr2;
	}

	public void setVisibility_adr2(int visibility_adr2) {
		this.visibility_adr2 = visibility_adr2;
	}

	public int getVisibility_name() {
		return visibility_name;
	}

	public void setVisibility_name(int visibility_name) {
		this.visibility_name = visibility_name;
	}

	public int getVisibility_mail() {
		return visibility_mail;
	}

	public void setVisibility_mail(int visibility_mail) {
		this.visibility_mail = visibility_mail;
	}

	public int getVisibility_country() {
		return visibility_country;
	}

	public void setVisibility_country(int visibility_country) {
		this.visibility_country = visibility_country;
	}

	public int getVisibility_tel() {
		return visibility_tel;
	}

	public void setVisibility_tel(int visibility_tel) {
		this.visibility_tel = visibility_tel;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getCardMonth() {
		return cardMonth;
	}

	public void setCardMonth(String cardMonth) {
		this.cardMonth = cardMonth;
	}

	public String getCardYear() {
		return cardYear;
	}

	public void setCardYear(String cardYear) {
		this.cardYear = cardYear;
	}
	
	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public int getQuickChargeStatus() {
		return quickChargeStatus;
	}

	public void setQuickChargeStatus(int quickChargeStatus) {
		this.quickChargeStatus = quickChargeStatus;
	}

	public int getVisibility_note() {
		return visibility_note;
	}

	public void setVisibility_note(int visibility_note) {
		this.visibility_note = visibility_note;
	}
	
}
