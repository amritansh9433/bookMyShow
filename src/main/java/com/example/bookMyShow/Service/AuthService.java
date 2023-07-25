package com.example.bookMyShow.Service;

import com.example.bookMyShow.payload.LoginDto;
import com.example.bookMyShow.payload.RegisterDto;

public interface AuthService {
    String login(LoginDto loginDto);
    String register(RegisterDto registerDto);
}
