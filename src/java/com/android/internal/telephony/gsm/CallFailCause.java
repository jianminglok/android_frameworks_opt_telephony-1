/*
 * Copyright (C) 2006 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.internal.telephony.gsm;

/**
 * Call fail causes from TS 24.008 .
 * These are mostly the cause codes we need to distinguish for the UI.
 * See 22.001 Annex F.4 for mapping of cause codes to local tones.
 *
 * {@hide}
 *
 */
public interface CallFailCause {
    // Unassigned/Unobtainable number
    static final int UNOBTAINABLE_NUMBER = 1;

    static final int NORMAL_CLEARING     = 16;
    // Busy Tone
    static final int USER_BUSY           = 17;

    // No Tone
    static final int NUMBER_CHANGED      = 22;
    static final int STATUS_ENQUIRY      = 30;
    static final int NORMAL_UNSPECIFIED  = 31;

    // Congestion Tone
    static final int NO_CIRCUIT_AVAIL    = 34;
    static final int TEMPORARY_FAILURE   = 41;
    static final int SWITCHING_CONGESTION    = 42;
    static final int CHANNEL_NOT_AVAIL   = 44;
    static final int QOS_NOT_AVAIL       = 49;
    static final int BEARER_NOT_AVAIL    = 58;

    // others
    static final int ACM_LIMIT_EXCEEDED = 68;
    static final int CALL_BARRED        = 240;
    static final int FDN_BLOCKED        = 241;

    // Stk Call Control
    static final int DIAL_MODIFIED_TO_USSD = 244;
    static final int DIAL_MODIFIED_TO_SS = 245;
    static final int DIAL_MODIFIED_TO_DIAL = 246;

    static final int ERROR_UNSPECIFIED = 0xffff;

    // MTK

    static final int NO_ROUTE_TO_DESTINATION = NO_ROUTE_TO_DESTINAON;
    static final int NO_USER_RESPONDING = CALL_FAIL_NO_USER_RESPONDING;
    static final int USER_ALERTING_NO_ANSWER = CALL_FAIL_NO_ANSWER_FROM_USER;
    static final int PRE_EMPTION = PREEMPTION;
    static final int DESTINATION_OUT_OF_ORDER = CALL_FAIL_DESTINATION_OUT_OF_ORDER;
    static final int INVALID_NUMBER_FORMAT = INVALID_NUMBER;
    static final int RESOURCE_UNAVAILABLE = RESOURCES_UNAVAILABLE_OR_UNSPECIFIED;
    static final int INCOMING_CALL_BARRED_WITHIN_CUG = INCOMING_CALLS_BARRED_WITHIN_CUG;
    static final int BEARER_NOT_AUTHORIZED = BEARER_CAPABILITY_NOT_AUTHORIZED;
    static final int SERVICE_NOT_AVAILABLE = SERVICE_OPTION_NOT_AVAILABLE;
    static final int BEARER_NOT_IMPLEMENT = BEARER_SERVICE_NOT_IMPLEMENTED;
    static final int FACILITY_NOT_IMPLEMENT = REQUESTED_FACILITY_NOT_IMPLEMENTED;
    static final int RESTRICTED_BEARER_AVAILABLE = ONLY_DIGITAL_INFORMATION_BEARER_AVAILABLE;
    static final int OPTION_NOT_AVAILABLE = SERVICE_OR_OPTION_NOT_IMPLEMENTED;
    static final int INVALID_TRANSACTION_ID_VALUE = INVALID_TRANSACTION_IDENTIFIER;
    static final int INVALID_TRANSIT_NETWORK_SELECTION = INVALID_TRANSIT_NW_SELECTION;
    static final int MESSAGE_TYPE_NON_EXISTENT = MESSAGE_TYPE_NON_IMPLEMENTED;
    static final int MESSAGE_TYPE_NOT_COMPATIBLE_WITH_PROT_STATE = MESSAGE_TYPE_NOT_COMPATIBLE_WITH_PROTOCOL_STATE;
    static final int IE_NON_EXISTENT_OR_NOT_IMPLEMENTED = INFORMATION_ELEMENT_NON_EXISTENT;
    static final int RECOVERY_ON_TIMER_EXPIRY = RECOVERY_ON_TIMER_EXPIRED;
    static final int CM_MM_RR_CONNECTION_RELEASE = 2165;

    /// M: IMS feature. @{
    /* Normal call failed, need to dial as ECC */
    static final int IMS_EMERGENCY_REREG = 380;
    /// @}
}
