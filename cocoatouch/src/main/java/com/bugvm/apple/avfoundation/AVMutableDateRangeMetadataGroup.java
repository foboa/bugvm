/*
 * Copyright (C) 2013-2015 RoboVM AB
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
package com.bugvm.apple.avfoundation;

/*<imports>*/

import com.bugvm.apple.foundation.NSArray;
import com.bugvm.apple.foundation.NSDate;
import com.bugvm.objc.ObjCRuntime;
import com.bugvm.objc.annotation.NativeClass;
import com.bugvm.objc.annotation.Property;
import com.bugvm.objc.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVMutableDateRangeMetadataGroup/*</name>*/ 
    extends /*<extends>*/AVDateRangeMetadataGroup/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVMutableDateRangeMetadataGroupPtr extends Ptr<AVMutableDateRangeMetadataGroup, AVMutableDateRangeMetadataGroupPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVMutableDateRangeMetadataGroup.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVMutableDateRangeMetadataGroup() {}
    protected AVMutableDateRangeMetadataGroup(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "startDate")
    public native NSDate getStartDate();
    @Property(selector = "setStartDate:")
    public native void setStartDate(NSDate v);
    @Property(selector = "endDate")
    public native NSDate getEndDate();
    @Property(selector = "setEndDate:")
    public native void setEndDate(NSDate v);
    @Property(selector = "items")
    public native NSArray<AVMetadataItem> getItems();
    @Property(selector = "setItems:")
    public native void setItems(NSArray<AVMetadataItem> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}