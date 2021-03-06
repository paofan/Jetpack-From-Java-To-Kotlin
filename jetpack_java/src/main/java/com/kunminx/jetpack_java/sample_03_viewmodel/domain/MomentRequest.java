

package com.kunminx.jetpack_java.sample_03_viewmodel.domain;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.kunminx.jetpack_java.sample_03_viewmodel.data.DataRepository;
import com.kunminx.jetpack_java.common_data.bean.Moment;

import java.util.List;

/**
 * TODO：本示例专注于提供 ViewModel 组件的使用场景和示例，因而其他内容均保持 Android 引入 Jetpack 前的模样，
 * kotlin 模块提供同样的场景和基于 Kotlin 的写法，可对照查阅。
 * 并且本项目的示例从 sample_01 到 sample_05 是循序渐进地 Jetpack 化，
 * 如看完对 Jetpack 高频核心组件 "为什么要用"、"为什么要这样用" 有了一丝丝好奇心，可前往《Jetpack MVVM 精讲》和《Jetpack MVVM 最佳实践》项目查阅深度解析。
 * <p>
 * https://juejin.im/post/5dafc49b6fb9a04e17209922
 * <p>
 * https://github.com/KunMinX/Jetpack-MVVM-Best-Practice
 * <p>
 * <p>
 * Create by KunMinX at 2020/5/30
 */
public class MomentRequest implements Request.IMomentRequest {

    private MutableLiveData<List<Moment>> mListMutableLiveData;

    @Override
    public LiveData<List<Moment>> getListMutableLiveData() {
        if (mListMutableLiveData == null) {
            mListMutableLiveData = new MutableLiveData<>();
        }
        return mListMutableLiveData;
    }

    @Override
    public void requestList() {
        DataRepository.getInstance().requestList(mListMutableLiveData);
    }
}
