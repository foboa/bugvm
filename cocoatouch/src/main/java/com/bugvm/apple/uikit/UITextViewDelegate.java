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
package com.bugvm.apple.uikit;

/*<imports>*/

import com.bugvm.apple.foundation.NSObjectProtocol;
import com.bugvm.apple.foundation.NSRange;
import com.bugvm.apple.foundation.NSURL;
import com.bugvm.objc.annotation.Method;
import com.bugvm.objc.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/UITextViewDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol, UIScrollViewDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "textViewShouldBeginEditing:")
    boolean shouldBeginEditing(UITextView textView);
    @Method(selector = "textViewShouldEndEditing:")
    boolean shouldEndEditing(UITextView textView);
    @Method(selector = "textViewDidBeginEditing:")
    void didBeginEditing(UITextView textView);
    @Method(selector = "textViewDidEndEditing:")
    void didEndEditing(UITextView textView);
    @Method(selector = "textView:shouldChangeTextInRange:replacementText:")
    boolean shouldChangeCharacters(UITextView textView, @ByVal NSRange range, String text);
    @Method(selector = "textViewDidChange:")
    void didChange(UITextView textView);
    @Method(selector = "textViewDidChangeSelection:")
    void didChangeSelection(UITextView textView);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Method(selector = "textView:shouldInteractWithURL:inRange:")
    boolean shouldInteractWithURL(UITextView textView, NSURL URL, @ByVal NSRange characterRange);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Method(selector = "textView:shouldInteractWithTextAttachment:inRange:")
    boolean shouldInteractWithTextAttachment(UITextView textView, NSTextAttachment textAttachment, @ByVal NSRange characterRange);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}