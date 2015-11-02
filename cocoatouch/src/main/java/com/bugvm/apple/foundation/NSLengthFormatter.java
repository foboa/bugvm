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
package com.bugvm.apple.foundation;

/*<imports>*/

import com.bugvm.objc.ObjCRuntime;
import com.bugvm.objc.annotation.Method;
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
 * @since Available in iOS 8.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Foundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSLengthFormatter/*</name>*/ 
    extends /*<extends>*/NSFormatter/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSLengthFormatterPtr extends Ptr<NSLengthFormatter, NSLengthFormatterPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSLengthFormatter.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSLengthFormatter() {}
    protected NSLengthFormatter(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "numberFormatter")
    public native NSNumberFormatter getNumberFormatter();
    @Property(selector = "setNumberFormatter:")
    public native void setNumberFormatter(NSNumberFormatter v);
    @Property(selector = "unitStyle")
    public native NSFormattingUnitStyle getUnitStyle();
    @Property(selector = "setUnitStyle:")
    public native void setUnitStyle(NSFormattingUnitStyle v);
    @Property(selector = "isForPersonHeightUse")
    public native boolean isForPersonHeightUse();
    @Property(selector = "setForPersonHeightUse:")
    public native void setForPersonHeightUse(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    public String formatUnitMeters(double numberInMeters) {
        return formatUnitMeters(numberInMeters, new MachineSizedSIntPtr());
    }
    /*<methods>*/
    @Method(selector = "stringFromValue:unit:")
    public native String format(double value, NSLengthFormatterUnit unit);
    @Method(selector = "stringFromMeters:")
    public native String formatMeters(double numberInMeters);
    @Method(selector = "unitStringFromValue:unit:")
    public native String formatUnit(double value, NSLengthFormatterUnit unit);
    @Method(selector = "unitStringFromMeters:usedUnit:")
    protected native String formatUnitMeters(double numberInMeters, MachineSizedSIntPtr unitp);
    /*</methods>*/
}