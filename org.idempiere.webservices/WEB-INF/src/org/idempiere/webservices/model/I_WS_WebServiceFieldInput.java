/******************************************************************************
 * Product: iDempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2012 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package org.idempiere.webservices.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Interface for WS_WebServiceFieldInput
 *  @author iDempiere (generated) 
 *  @version Release 12
 */
@SuppressWarnings("all")
public interface I_WS_WebServiceFieldInput 
{

    /** TableName=WS_WebServiceFieldInput */
    public static final String Table_Name = "WS_WebServiceFieldInput";

    /** AD_Table_ID=53166 */
    public static final int Table_ID = 53166;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 6 - System - Client 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Tenant.
	  * Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_Column_ID */
    public static final String COLUMNNAME_AD_Column_ID = "AD_Column_ID";

	/** Set Column.
	  * Column in the table
	  */
	public void setAD_Column_ID (int AD_Column_ID);

	/** Get Column.
	  * Column in the table
	  */
	public int getAD_Column_ID();

	public org.compiere.model.I_AD_Column getAD_Column() throws RuntimeException;

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within tenant
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within tenant
	  */
	public int getAD_Org_ID();

    /** Column name AD_Reference_ID */
    public static final String COLUMNNAME_AD_Reference_ID = "AD_Reference_ID";

	/** Set Reference.
	  * System Reference and Validation
	  */
	public void setAD_Reference_ID (int AD_Reference_ID);

	/** Get Reference.
	  * System Reference and Validation
	  */
	public int getAD_Reference_ID();

	public org.compiere.model.I_AD_Reference getAD_Reference() throws RuntimeException;

    /** Column name AD_Reference_Value_ID */
    public static final String COLUMNNAME_AD_Reference_Value_ID = "AD_Reference_Value_ID";

	/** Set Reference Key.
	  * Required to specify, if data type is Table or List
	  */
	public void setAD_Reference_Value_ID (int AD_Reference_Value_ID);

	/** Get Reference Key.
	  * Required to specify, if data type is Table or List
	  */
	public int getAD_Reference_Value_ID();

	public org.compiere.model.I_AD_Reference getAD_Reference_Value() throws RuntimeException;

    /** Column name ColumnName */
    public static final String COLUMNNAME_ColumnName = "ColumnName";

	/** Set DB Column Name.
	  * Name of the column in the database
	  */
	public void setColumnName (String ColumnName);

	/** Get DB Column Name.
	  * Name of the column in the database
	  */
	public String getColumnName();

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Created.
	  * Date this record was created
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Created By.
	  * User who created this records
	  */
	public int getCreatedBy();

    /** Column name IdentifierLogic */
    public static final String COLUMNNAME_IdentifierLogic = "IdentifierLogic";

	/** Set Identifier Logic	  */
	public void setIdentifierLogic (String IdentifierLogic);

	/** Get Identifier Logic	  */
	public String getIdentifierLogic();

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive (boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name IsIdentifier */
    public static final String COLUMNNAME_IsIdentifier = "IsIdentifier";

	/** Set Identifier.
	  * This column is part of the record identifier
	  */
	public void setIsIdentifier (boolean IsIdentifier);

	/** Get Identifier.
	  * This column is part of the record identifier
	  */
	public boolean isIdentifier();

    /** Column name IsNullIdentifier */
    public static final String COLUMNNAME_IsNullIdentifier = "IsNullIdentifier";

	/** Set Allow Null Value.
	  * Should allow null value for identifier field
	  */
	public void setIsNullIdentifier (boolean IsNullIdentifier);

	/** Get Allow Null Value.
	  * Should allow null value for identifier field
	  */
	public boolean isNullIdentifier();

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Updated.
	  * Date this record was updated
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Updated By.
	  * User who updated this records
	  */
	public int getUpdatedBy();

    /** Column name WS_WebServiceFieldInput_ID */
    public static final String COLUMNNAME_WS_WebServiceFieldInput_ID = "WS_WebServiceFieldInput_ID";

	/** Set Web Service Field Input	  */
	public void setWS_WebServiceFieldInput_ID (int WS_WebServiceFieldInput_ID);

	/** Get Web Service Field Input	  */
	public int getWS_WebServiceFieldInput_ID();

    /** Column name WS_WebServiceFieldInput_UU */
    public static final String COLUMNNAME_WS_WebServiceFieldInput_UU = "WS_WebServiceFieldInput_UU";

	/** Set WS_WebServiceFieldInput_UU	  */
	public void setWS_WebServiceFieldInput_UU (String WS_WebServiceFieldInput_UU);

	/** Get WS_WebServiceFieldInput_UU	  */
	public String getWS_WebServiceFieldInput_UU();

    /** Column name WS_WebServiceType_ID */
    public static final String COLUMNNAME_WS_WebServiceType_ID = "WS_WebServiceType_ID";

	/** Set Web Service Type	  */
	public void setWS_WebServiceType_ID (int WS_WebServiceType_ID);

	/** Get Web Service Type	  */
	public int getWS_WebServiceType_ID();

	public I_WS_WebServiceType getWS_WebServiceType() throws RuntimeException;
}
