/*
 * Copyright (C) 2012 RoboVM
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
package org.robovm.cocoatouch.foundation;

/*<imports>*/
import org.robovm.objc.ObjCClass;
import org.robovm.objc.ObjCObject;
import org.robovm.objc.ObjCRuntime;
import org.robovm.rt.bro.annotation.Library;
import org.robovm.rt.bro.annotation.Pointer;
/*</imports>*/

/**
 *
 *
 * <div class="javadoc">
 *   @see <a href="http://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/ObjC_classic/../Classes/NSString_Class/Reference/NSString.html">NSString Class Reference</a>
 *   @since Available in iOS 2.0 and later.
 * </div>
 */
/*<library>*/@Library("Foundation")/*</library>*/
public class /*<name>*/ NSString /*</name>*/ 
    extends /*<extends>*/ NSObject /*</extends>*/ 
    /*<implements>*/ /*</implements>*/ {

    static {
        ObjCRuntime.bind(/*<name>*/ NSString /*</name>*/.class);
    }

    private static final ObjCClass objCClass = ObjCClass.getByType(/*<name>*/ NSString /*</name>*/.class);

    public NSString(String s) {
        super((SkipInit) null);
    }
    
    /*<constructors>*/
    protected NSString(SkipInit skipInit) { super(skipInit); }
    public NSString() {}
    
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    
    /*</methods>*/

    public static class StringMarshaler {
        @SuppressWarnings("rawtypes")
        public static Object toObject(Class cls, long handle, boolean copy) {
            NSString o = ObjCObject.toObjCObject(NSString.class, handle);
            return o != null ? o.toString() : null;
        }
        public static void updateObject(Object o, long handle) {
        }
        public static @Pointer long toNative(Object o) {
            if (o == null) {
                return 0L;
            }
            return new NSString((String) o).getHandle();
        }
        public static void updateNative(Object o, long handle) {
        }
    }
}