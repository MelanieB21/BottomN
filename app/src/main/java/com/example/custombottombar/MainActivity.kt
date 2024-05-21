package com.example.custombottombar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.ScaleAnimation
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var selectedTab: Int = 1;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val homeLayout: LinearLayout = findViewById(R.id.homeLayout)
        val likeLayout: LinearLayout = findViewById(R.id.likeLayout)
        val notificationLayout: LinearLayout = findViewById(R.id.notificationLayout)
        val profileLayout: LinearLayout = findViewById(R.id.profileLayout)

        val homeImage: ImageView = findViewById(R.id.homeImage)
        val likeImage: ImageView = findViewById(R.id.likeImage)
        val notificationImage: ImageView = findViewById(R.id.notificationImage)
        val profileImage: ImageView = findViewById(R.id.profileImage)

        val homeTxt: TextView = findViewById(R.id.homeTxt)
        val likeTxt: TextView = findViewById(R.id.likeTxt)
        val notificationTxt: TextView = findViewById(R.id.notificationTxt)
        val profileTxt: TextView = findViewById(R.id.profileTxt)

        supportFragmentManager.beginTransaction()
            .setReorderingAllowed(true)
            .replace(R.id.fragmentContainer, HomeFragment::class.java, null)
            .commit()

        homeLayout.setOnClickListener{
            if (selectedTab != 1) {

                supportFragmentManager.beginTransaction()
                    .setReorderingAllowed(true)
                    .replace(R.id.fragmentContainer, HomeFragment::class.java, null)
                    .commit()

                likeTxt.visibility = View.GONE
                notificationTxt.visibility = View.GONE
                profileTxt.visibility = View.GONE

                likeImage.setImageResource(R.drawable.baseline_check_24)
                notificationImage.setImageResource(R.drawable.baseline_circle_notifications_24)
                profileImage.setImageResource(R.drawable.ic_baseline_person_24)

                likeLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))
                notificationLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))
                profileLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))

                homeTxt.visibility = View.VISIBLE
                homeImage.setImageResource(R.drawable.ic_baseline_home_selected_24)
                homeLayout.setBackgroundResource(R.drawable.round_back_home_100)

                val scaleAnimation = ScaleAnimation(
                    0.8f, 1.0f, // fromX, toX
                    1.0f, 1.0f, // fromY, toY
                    Animation.RELATIVE_TO_SELF, 0.0f, // pivotXType, pivotXValue
                    Animation.RELATIVE_TO_SELF, 0.0f  // pivotYType, pivotYValue
                ).apply {
                    duration = 200
                    fillAfter = true
                }

                homeLayout.startAnimation(scaleAnimation)

                selectedTab = 1
            }
        }

        likeLayout.setOnClickListener{
            if (selectedTab != 2) {

                supportFragmentManager.beginTransaction()
                    .setReorderingAllowed(true)
                    .replace(R.id.fragmentContainer, LikesFragment::class.java, null)
                    .commit()

                homeTxt.visibility = View.GONE
                notificationTxt.visibility = View.GONE
                profileTxt.visibility = View.GONE

                homeImage.setImageResource(R.drawable.ic_baseline_home_24)
                notificationImage.setImageResource(R.drawable.baseline_circle_notifications_24)
                profileImage.setImageResource(R.drawable.ic_baseline_person_24)

                homeLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))
                notificationLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))
                profileLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))

                likeTxt.visibility = View.VISIBLE
                likeImage.setImageResource(R.drawable.baseline_check_selected_24)
                likeLayout.setBackgroundResource(R.drawable.round_back_like_100)

                val scaleAnimation = ScaleAnimation(
                    0.8f, 1.0f, // fromX, toX
                    1.0f, 1.0f, // fromY, toY
                    Animation.RELATIVE_TO_SELF, 1.0f, // pivotXType, pivotXValue
                    Animation.RELATIVE_TO_SELF, 0.0f  // pivotYType, pivotYValue
                ).apply {
                    duration = 200
                    fillAfter = true
                }

                likeLayout.startAnimation(scaleAnimation)

                selectedTab = 2
            }
        }

        notificationLayout.setOnClickListener{
            if (selectedTab != 3) {

                supportFragmentManager.beginTransaction()
                    .setReorderingAllowed(true)
                    .replace(R.id.fragmentContainer, NotificationFragment::class.java, null)
                    .commit()

                homeTxt.visibility = View.GONE
                likeTxt.visibility = View.GONE
                profileTxt.visibility = View.GONE

                homeImage.setImageResource(R.drawable.ic_baseline_home_24)
                likeImage.setImageResource(R.drawable.baseline_check_24)
                profileImage.setImageResource(R.drawable.ic_baseline_person_24)

                homeLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))
                likeLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))
                profileLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))

                notificationTxt.visibility = View.VISIBLE
                notificationImage.setImageResource(R.drawable.baseline_circle_notifications_selected_24)
                notificationLayout.setBackgroundResource(R.drawable.round_back_notification_100)

                val scaleAnimation = ScaleAnimation(
                    0.8f, 1.0f, // fromX, toX
                    1.0f, 1.0f, // fromY, toY
                    Animation.RELATIVE_TO_SELF, 1.0f, // pivotXType, pivotXValue
                    Animation.RELATIVE_TO_SELF, 0.0f  // pivotYType, pivotYValue
                ).apply {
                    duration = 200
                    fillAfter = true
                }

                notificationLayout.startAnimation(scaleAnimation)

                selectedTab = 3
            }
        }

        profileLayout.setOnClickListener{
            if (selectedTab != 4) {

                supportFragmentManager.beginTransaction()
                    .setReorderingAllowed(true)
                    .replace(R.id.fragmentContainer, ProfileFragment::class.java, null)
                    .commit()

                homeTxt.visibility = View.GONE
                likeTxt.visibility = View.GONE
                notificationTxt.visibility = View.GONE

                homeImage.setImageResource(R.drawable.ic_baseline_home_24)
                likeImage.setImageResource(R.drawable.baseline_check_24)
                notificationImage.setImageResource(R.drawable.baseline_circle_notifications_24)

                homeLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))
                likeLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))
                notificationLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))

                profileTxt.visibility = View.VISIBLE
                profileImage.setImageResource(R.drawable.ic_baseline_person_selected_24)
                profileLayout.setBackgroundResource(R.drawable.round_back_profile_100)

                val scaleAnimation = ScaleAnimation(
                    0.8f, 1.0f, // fromX, toX
                    1.0f, 1.0f, // fromY, toY
                    Animation.RELATIVE_TO_SELF, 1.0f, // pivotXType, pivotXValue
                    Animation.RELATIVE_TO_SELF, 0.0f  // pivotYType, pivotYValue
                ).apply {
                    duration = 200
                    fillAfter = true
                }

                profileLayout.startAnimation(scaleAnimation)

                selectedTab = 4
            }
        }

    }
}